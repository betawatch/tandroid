package org.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.telegram.messenger.a8;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.ThreadUtils;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static volatile boolean speakerMute;
    private static int streamType;
    private static int usageAttribute;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    /* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;
        private long lastPlaybackHeadPosition;
        private long lastTimestamp;
        private long targetTimeNs;
        private long writtenFrames;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.writtenFrames = 0L;
            this.lastPlaybackHeadPosition = 0L;
            this.lastTimestamp = System.nanoTime();
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i7, boolean z9) {
            if (audioTrack == null) {
                return 0;
            }
            return audioTrack.write(byteBuffer, i7, !z9 ? 1 : 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            WebRtcAudioTrack.this.audioTrack.getChannelCount();
            WebRtcAudioTrack.this.audioTrack.getSampleRate();
            this.targetTimeNs = System.nanoTime();
            boolean z9 = false;
            while (this.keepAlive && WebRtcAudioTrack.this.audioTrack != null) {
                try {
                    WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                    webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                    WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                    if (WebRtcAudioTrack.speakerMute) {
                        WebRtcAudioTrack.this.byteBuffer.clear();
                        WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                        WebRtcAudioTrack.this.byteBuffer.position(0);
                    }
                    int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity, z9);
                    if (writeBytes != capacity) {
                        Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writeBytes);
                        if (writeBytes < 0) {
                            this.keepAlive = false;
                            WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                        }
                    }
                    WebRtcAudioTrack.this.byteBuffer.rewind();
                    z9 = !z9;
                    WebRtcAudioTrack.this.byteBuffer.rewind();
                    this.targetTimeNs += 10000000;
                    long nanoTime = this.targetTimeNs - System.nanoTime();
                    if (nanoTime > 0) {
                        try {
                            Thread.sleep(nanoTime / 1000000, (int) (nanoTime % 1000000));
                        } catch (InterruptedException e10) {
                            a8.g(e10, true);
                        }
                    } else {
                        this.targetTimeNs = System.nanoTime();
                    }
                } catch (Throwable unused) {
                    this.keepAlive = false;
                }
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (Exception e11) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e11.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    /* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
        streamType = 0;
    }

    public WebRtcAudioTrack(long j3) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j3;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z9) {
        if (!z9) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i7) {
        return i7 == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i7, int i10, int i11) {
        Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(streamType);
        Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i7 != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != DEFAULT_USAGE) {
            Logging.w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i7).setChannelMask(i10).build(), i11, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i7, int i10, int i11) {
        return new AudioTrack(streamType, i7, i10, 2, i11, 1);
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(streamType);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(streamType);
    }

    private int initPlayout(int i7, int i10, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(sampleRate=" + i7 + ", channels=" + i10 + ", bufferSizeFactor=" + d + ")");
        this.byteBuffer = ByteBuffer.allocateDirect((i7 / 100) * i10 * 2);
        StringBuilder sb2 = new StringBuilder("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.d(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i10);
        int minBufferSize = (int) (AudioTrack.getMinBufferSize(i7, channelCountToConfiguration, 2) * d);
        Logging.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            AudioTrack createAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i7, channelCountToConfiguration, minBufferSize);
            this.audioTrack = createAudioTrackOnLollipopOrHigher;
            if (createAudioTrackOnLollipopOrHigher == null || createAudioTrackOnLollipopOrHigher.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            logMainParameters();
            logMainParametersExtended();
            return minBufferSize;
        } catch (IllegalArgumentException e10) {
            reportWebRtcAudioTrackInitError(e10.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    public static boolean isSpeakerMuted() {
        return speakerMute;
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        Logging.d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
    }

    private void logMainParameters() {
        Logging.d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i7, long j3);

    private void releaseAudioResources() {
        Logging.e(TAG, "releaseAudioResources", new Exception());
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            this.audioTrack = null;
            try {
                audioTrack.release();
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioStreamType(int i7) {
        synchronized (WebRtcAudioTrack.class) {
            streamType = i7;
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i7) {
        synchronized (WebRtcAudioTrack.class) {
            Logging.w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i7);
            usageAttribute = i7;
        }
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z9) {
        Logging.w(TAG, "setSpeakerMute(" + z9 + ")");
        speakerMute = z9;
    }

    private boolean setStreamVolume(int i7) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i7 + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(streamType, i7, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() == 3) {
                AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return true;
            }
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
            releaseAudioResources();
            return false;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e10.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        try {
            this.threadChecker.checkIsOnValidThread();
            Logging.d(TAG, "stopPlayout");
            assertTrue(this.audioThread != null);
            logUnderrunCount();
            this.audioThread.stopThread();
            Logging.d(TAG, "Stopping the AudioTrackThread...");
            this.audioThread.interrupt();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
                Logging.e(TAG, "Join of AudioTrackThread timed out.");
                WebRtcAudioUtils.logAudioState(TAG);
            }
            Logging.d(TAG, "AudioTrackThread has now been stopped.");
        } finally {
            try {
                releaseAudioResources();
                return true;
            } finally {
            }
        }
        try {
            releaseAudioResources();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        return true;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }
}

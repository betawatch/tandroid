package org.webrtc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class RenderSynchronizer {
    private static final float DEFAULT_TARGET_FPS = 30.0f;
    private static final String TAG = "RenderSynchronizer";
    private Choreographer choreographer;
    private boolean isListening;
    private long lastOpenedTimeNanos;
    private long lastRefreshTimeNanos;
    private final List<Listener> listeners;
    private final Object lock;
    private final Handler mainThreadHandler;
    private boolean renderWindowOpen;
    private final long targetFrameIntervalNanos;

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    public RenderSynchronizer(float f7) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(TimeUnit.SECONDS.toNanos(1L) / f7);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new n(this, 1));
        Logging.d(TAG, "Created");
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.choreographer = Choreographer.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerListener$1() {
        this.choreographer.postFrameCallback(new o(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDisplayRefreshCycleBegin(long j3) {
        synchronized (this.lock) {
            try {
                if (this.listeners.isEmpty()) {
                    Logging.d(TAG, "No listeners, unsubscribing to frame callbacks");
                    this.isListening = false;
                    return;
                }
                this.choreographer.postFrameCallback(new o(this));
                long j10 = j3 - this.lastOpenedTimeNanos;
                long j11 = j3 - this.lastRefreshTimeNanos;
                this.lastRefreshTimeNanos = j3;
                if (Math.abs(j10 - this.targetFrameIntervalNanos) < Math.abs((j10 - this.targetFrameIntervalNanos) + j11)) {
                    this.lastOpenedTimeNanos = j3;
                    openRenderWindow();
                } else if (this.renderWindowOpen) {
                    closeRenderWindow();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowOpen();
        }
    }

    private void traceRenderWindowChange() {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter("RenderWindow", this.renderWindowOpen ? 1L : 0L);
        }
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            try {
                if (!this.isListening) {
                    Logging.d(TAG, "First listener, subscribing to frame callbacks");
                    this.isListening = true;
                    this.mainThreadHandler.post(new n(this, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer() {
        this(DEFAULT_TARGET_FPS);
    }
}

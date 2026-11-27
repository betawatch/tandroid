package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class DataChannel {
    private final NativeLifecycleLock lifecycleLock;
    private long nativeObserver;

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        public Buffer(ByteBuffer byteBuffer, boolean z) {
            this.data = byteBuffer;
            this.binary = z;
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    /* loaded from: classes2.dex */
    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";
        public int id = -1;

        public int getId() {
            return this.id;
        }

        public int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        public int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        public boolean getNegotiated() {
            return this.negotiated;
        }

        public boolean getOrdered() {
            return this.ordered;
        }

        public String getProtocol() {
            return this.protocol;
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Natives {
        long bufferedAmount(DataChannel dataChannel);

        void close(DataChannel dataChannel);

        int id(DataChannel dataChannel);

        String label(DataChannel dataChannel);

        long registerObserver(DataChannel dataChannel, Observer observer);

        boolean send(DataChannel dataChannel, byte[] bArr, boolean z);

        State state(DataChannel dataChannel);

        void unregisterObserver(DataChannel dataChannel, long j);
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public interface Observer {
        void onBufferedAmountChange(long j);

        void onMessage(Buffer buffer);

        void onStateChange();
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public DataChannel(long j) {
        this.lifecycleLock = new NativeLifecycleLock("DataChannel", j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$bufferedAmount$5() {
        return Long.valueOf(DataChannelJni.get().bufferedAmount(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$6() {
        DataChannelJni.get().close(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$id$3() {
        return Integer.valueOf(DataChannelJni.get().id(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$label$2() {
        return DataChannelJni.get().label(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerObserver$0(Observer observer) {
        if (this.nativeObserver != 0) {
            DataChannelJni.get().unregisterObserver(this, this.nativeObserver);
        }
        this.nativeObserver = DataChannelJni.get().registerObserver(this, observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$send$7(Buffer buffer) {
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return Boolean.valueOf(DataChannelJni.get().send(this, bArr, buffer.binary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$state$4() {
        return DataChannelJni.get().state(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unregisterObserver$1() {
        DataChannelJni.get().unregisterObserver(this, this.nativeObserver);
        this.nativeObserver = 0L;
    }

    public long bufferedAmount() {
        return ((Long) this.lifecycleLock.call(new o63(this, (byte) 5))).longValue();
    }

    public void close() {
        this.lifecycleLock.runIfAlive(new o63(this, (byte) 0));
    }

    public void dispose() {
        if (this.lifecycleLock.isDisposed()) {
            return;
        }
        if (this.nativeObserver != 0) {
            unregisterObserver();
        }
        this.lifecycleLock.dispose(new uy2((byte) 13));
    }

    public long getNativeDataChannel() {
        return this.lifecycleLock.getNativePointer();
    }

    public int id() {
        return ((Integer) this.lifecycleLock.call(new o63(this, (byte) 4))).intValue();
    }

    public String label() {
        return (String) this.lifecycleLock.call(new o63(this, (byte) 3));
    }

    public void registerObserver(Observer observer) {
        this.lifecycleLock.run(new q72((Object) this, (Object) observer, (byte) 16));
    }

    public boolean send(Buffer buffer) {
        return ((Boolean) this.lifecycleLock.call(new q72((Object) this, (Object) buffer, (byte) 17))).booleanValue();
    }

    public State state() {
        return (State) this.lifecycleLock.call(new o63(this, (byte) 1));
    }

    public void unregisterObserver() {
        this.lifecycleLock.runIfAlive(new o63(this, (byte) 2));
    }
}

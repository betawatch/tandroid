package org.webrtc;

import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class DtmfSender {
    private final NativeLifecycleLock lifecycleLock;

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Natives {
        boolean canInsertDtmf(long j);

        int duration(long j);

        boolean insertDtmf(long j, String str, int i, int i2);

        int interToneGap(long j);

        String tones(long j);
    }

    public DtmfSender(long j) {
        this.lifecycleLock = new NativeLifecycleLock("DtmfSender", j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$canInsertDtmf$0(long j) {
        return Boolean.valueOf(DtmfSenderJni.get().canInsertDtmf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$duration$3(long j) {
        return Integer.valueOf(DtmfSenderJni.get().duration(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$insertDtmf$1(String str, int i, int i2, long j) {
        return Boolean.valueOf(DtmfSenderJni.get().insertDtmf(j, str, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$interToneGap$4(long j) {
        return Integer.valueOf(DtmfSenderJni.get().interToneGap(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$tones$2(long j) {
        return DtmfSenderJni.get().tones(j);
    }

    public boolean canInsertDtmf() {
        return ((Boolean) this.lifecycleLock.call(new da3((byte) 25))).booleanValue();
    }

    public void dispose() {
        this.lifecycleLock.dispose(new da3((byte) 28));
    }

    public int duration() {
        return ((Integer) this.lifecycleLock.call(new da3((byte) 27))).intValue();
    }

    public boolean insertDtmf(String str, int i, int i2) {
        return ((Boolean) this.lifecycleLock.call((NativeLifecycleLock.NativePointerCallable) new wr3(i, i2, str))).booleanValue();
    }

    public int interToneGap() {
        return ((Integer) this.lifecycleLock.call(new da3((byte) 29))).intValue();
    }

    public String tones() {
        return (String) this.lifecycleLock.call(new da3((byte) 26));
    }
}

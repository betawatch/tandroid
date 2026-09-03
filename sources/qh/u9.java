package qh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.nio.ByteBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x039f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaCodec.BufferInfo bufferInfo;
        boolean z4;
        long j10;
        short s6;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.p9) this.b).setVisibility(8);
                return;
            case 1:
                ea eaVar = (ea) this.b;
                try {
                    int round = Math.round(((eaVar.h * eaVar.g.getInteger("sample-rate")) / eaVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(eaVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(eaVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    boolean z10 = false;
                    int i10 = -1;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    short s9 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = eaVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j10 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z4 = true;
                            } else {
                                z4 = z10;
                                j10 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, eaVar.f.getSampleTime(), 0);
                                eaVar.f.advance();
                            }
                        } else {
                            bufferInfo = bufferInfo2;
                            z4 = z10;
                            j10 = 2500;
                        }
                        if (i10 >= 0) {
                            createDecoderByType.getOutputBuffer(i10).position(0);
                        }
                        MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                        i10 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j10);
                        while (i10 != -1 && !z4) {
                            if (i10 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i10);
                                if (outputBuffer != null && bufferInfo3.size > 0) {
                                    int i14 = i13;
                                    while (outputBuffer.remaining() > 0) {
                                        short s10 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                        if (i14 >= round) {
                                            sArr[i11 - i12] = s9;
                                            i11++;
                                            int i15 = i11 - i12;
                                            if (i15 >= sArr.length || i11 >= eaVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new gu0(eaVar, sArr, i15, 14));
                                                sArr = sArr2;
                                                i12 = i11;
                                            }
                                            if (i11 >= eaVar.d.length) {
                                                i13 = 0;
                                                s9 = 0;
                                            } else {
                                                i14 = 0;
                                                s6 = 0;
                                            }
                                        } else {
                                            s6 = s9;
                                        }
                                        s9 = s6 < s10 ? s10 : s6;
                                        i14++;
                                        if (outputBuffer.remaining() < 8) {
                                            i13 = i14;
                                        } else {
                                            outputBuffer.position(outputBuffer.position() + 8);
                                        }
                                    }
                                    i13 = i14;
                                }
                                createDecoderByType.releaseOutputBuffer(i10, false);
                                if ((bufferInfo3.flags & 4) != 0) {
                                    z10 = true;
                                    synchronized (eaVar.i) {
                                        try {
                                            if (!eaVar.j) {
                                                if (!z10 && i11 < eaVar.b) {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else if (i10 == -3) {
                                createDecoderByType.getOutputBuffers();
                            }
                            i10 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                        }
                        z10 = z4;
                        synchronized (eaVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    eaVar.f.release();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 2:
                ga gaVar = (ga) this.b;
                ja jaVar = gaVar.c;
                if (jaVar != null) {
                    long j11 = jaVar.a;
                    if (j11 > 0) {
                        gaVar.e = j11;
                        gaVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ja jaVar2 = (ja) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = jaVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                Bitmap bitmap = null;
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(jaVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(jaVar2.f, jaVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(jaVar2.f / bitmap.getWidth(), jaVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) e2.c.d(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) e2.c.d(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) e2.c.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) e2.c.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (jaVar2.h) {
                            if (jaVar2.m == null) {
                                jaVar2.m = new Path();
                            }
                            jaVar2.m.rewind();
                            jaVar2.m.addCircle(jaVar2.f / 2.0f, jaVar2.g / 2.0f, Math.min(jaVar2.f, jaVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(jaVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, jaVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new l6(6, jaVar2, bitmap));
                return;
            case 4:
                mh.u9 u9Var = (mh.u9) this.b;
                u9Var.getClass();
                try {
                    sl0 currentListView = ((rh.g) u9Var.J0).O.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                sf.d dVar = (sf.d) this.b;
                AndroidUtilities.runOnUIThread(new sf.c(dVar.a, dVar.b, 1), 500L);
                return;
            case 6:
                ((sh.d0) this.b).invalidateSelf();
                return;
            case 7:
                ((sh.e0) this.b).invalidateSelf();
                return;
            case 8:
                ((sh.g0) this.b).d();
                return;
            case 9:
                ((sh.r0) this.b).c();
                return;
            case 10:
                ((sh.r0) this.b).c();
                return;
            case 11:
                ((sh.s0) this.b).a();
                return;
            case 12:
                ((sh.t0) this.b).a();
                return;
            case 13:
                ((sh.o2) this.b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 15:
                sh.m3 m3Var = (sh.m3) this.b;
                m3Var.N = m3Var.r;
                return;
            case 16:
                ((org.telegram.ui.Cells.f1) this.b).v();
                return;
            case 17:
                oh.f6 f6Var = ((uf.y0) this.b).y;
                if (f6Var != null) {
                    f6Var.p(3, true);
                    return;
                }
                return;
            case 18:
                vf.c cVar = (vf.c) this.b;
                cVar.c.V2.N(true);
                cVar.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                qc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                vf.e0 e0Var = (vf.e0) this.b;
                w51 w51Var = e0Var.a0;
                if (w51Var != null) {
                    w51Var.N(true);
                }
                e0Var.T(true);
                return;
            case 21:
                vf.l0 l0Var = (vf.l0) ((org.telegram.ui.Cells.f1) this.b).b;
                l0Var.c.V2.N(true);
                l0Var.b0();
                return;
            case 22:
                vf.n0 n0Var = (vf.n0) this.b;
                n0Var.c.V2.N(true);
                n0Var.V(true);
                return;
            case 23:
                vf.x0 x0Var = (vf.x0) this.b;
                x0Var.a.V2.N(true);
                x0Var.Y(true);
                return;
            case 24:
                ((hg.c1) this.b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((vf.p1) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.b).b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
            case 27:
                AndroidUtilities.showKeyboard(((wh.w) this.b).b0.b);
                return;
            case 28:
                ((wh.c0) this.b).invalidate();
                return;
            default:
                m.r3 r3Var = (m.r3) this.b;
                r3Var.c = null;
                r3Var.d = null;
                r3Var.e = null;
                r3Var.f = null;
                r3Var.e(null);
                return;
        }
    }
}

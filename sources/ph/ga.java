package ph;

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
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x03a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
                ha haVar = (ha) this.b;
                try {
                    int round = Math.round(((haVar.h * haVar.g.getInteger("sample-rate")) / haVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(haVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(haVar.g, (Surface) null, (MediaCrypto) null, 0);
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
                            int readSampleData = haVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j10 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z4 = true;
                            } else {
                                z4 = z10;
                                j10 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, haVar.f.getSampleTime(), 0);
                                haVar.f.advance();
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
                                            if (i15 >= sArr.length || i11 >= haVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new gu0(haVar, sArr, i15, 13));
                                                sArr = sArr2;
                                                i12 = i11;
                                            }
                                            if (i11 >= haVar.d.length) {
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
                                    synchronized (haVar.i) {
                                        try {
                                            if (!haVar.j) {
                                                if (!z10 && i11 < haVar.b) {
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
                        synchronized (haVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    haVar.f.release();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                ja jaVar = (ja) this.b;
                ma maVar = jaVar.c;
                if (maVar != null) {
                    long j11 = maVar.a;
                    if (j11 > 0) {
                        jaVar.e = j11;
                        jaVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ma maVar2 = (ma) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = maVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                Bitmap bitmap = null;
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(maVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(maVar2.f, maVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(maVar2.f / bitmap.getWidth(), maVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) e2.c.d(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) e2.c.d(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) e2.c.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) e2.c.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (maVar2.h) {
                            if (maVar2.m == null) {
                                maVar2.m = new Path();
                            }
                            maVar2.m.rewind();
                            maVar2.m.addCircle(maVar2.f / 2.0f, maVar2.g / 2.0f, Math.min(maVar2.f, maVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(maVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, maVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                AndroidUtilities.runOnUIThread(new e6(7, maVar2, bitmap));
                return;
            case 3:
                lh.u9 u9Var = (lh.u9) this.b;
                u9Var.getClass();
                try {
                    rl0 currentListView = ((qh.g) u9Var.J0).O.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 4:
                rf.d dVar = (rf.d) this.b;
                AndroidUtilities.runOnUIThread(new rf.c(dVar.a, dVar.b, 1), 500L);
                return;
            case 5:
                ((rh.d0) this.b).invalidateSelf();
                return;
            case 6:
                ((rh.e0) this.b).invalidateSelf();
                return;
            case 7:
                ((rh.g0) this.b).d();
                return;
            case 8:
                ((rh.r0) this.b).c();
                return;
            case 9:
                ((rh.r0) this.b).c();
                return;
            case 10:
                ((rh.s0) this.b).a();
                return;
            case 11:
                ((rh.t0) this.b).a();
                return;
            case 12:
                ((rh.o2) this.b).invalidate();
                return;
            case 13:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 14:
                rh.m3 m3Var = (rh.m3) this.b;
                m3Var.N = m3Var.r;
                return;
            case 15:
                ((o2.i) this.b).q2();
                return;
            case 16:
                nh.f6 f6Var = ((tf.y0) this.b).y;
                if (f6Var != null) {
                    f6Var.p(3, true);
                    return;
                }
                return;
            case 17:
                uf.c cVar = (uf.c) this.b;
                cVar.c.V2.N(true);
                cVar.V(true);
                return;
            case 18:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                qc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 19:
                uf.f0 f0Var = (uf.f0) this.b;
                w51 w51Var = f0Var.a0;
                if (w51Var != null) {
                    w51Var.N(true);
                }
                f0Var.T(true);
                return;
            case 20:
                uf.l0 l0Var = (uf.l0) ((o2.i) this.b).b;
                l0Var.c.V2.N(true);
                l0Var.b0();
                return;
            case 21:
                uf.n0 n0Var = (uf.n0) this.b;
                n0Var.c.V2.N(true);
                n0Var.V(true);
                return;
            case 22:
                uf.x0 x0Var = (uf.x0) this.b;
                x0Var.a.V2.N(true);
                x0Var.Y(true);
                return;
            case 23:
                ((gg.c1) this.b).run(Boolean.FALSE);
                return;
            case 24:
                NotificationCenter.getInstance(((uf.p1) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 25:
                org.telegram.ui.Cells.f3 f3Var = ((org.telegram.ui.Cells.h3) this.b).b;
                f3Var.requestFocus();
                AndroidUtilities.showKeyboard(f3Var);
                return;
            case 26:
                AndroidUtilities.showKeyboard(((vh.w) this.b).b0.b);
                return;
            case 27:
                ((vh.c0) this.b).invalidate();
                return;
            case 28:
                m.s3 s3Var = (m.s3) this.b;
                s3Var.c = null;
                s3Var.d = null;
                s3Var.e = null;
                s3Var.f = null;
                s3Var.e(null);
                return;
            default:
                ((vh.v1) this.b).invalidateSelf();
                return;
        }
    }
}

package vh;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.cd;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a() {
        bh.d dVar = (bh.d) this.b;
        synchronized (((ArrayDeque) dVar.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) dVar.a).edit();
            String str = (String) dVar.b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) dVar.d).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) dVar.c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        long j10;
        int i10;
        int i11;
        short s10;
        Bitmap bitmap = null;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                jg.i iVar = g0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                g0Var.b.k();
                return;
            case 1:
                ((o0) this.b).a(false);
                return;
            case 2:
                q3 q3Var = (q3) this.b;
                wb.e();
                kg.i1 i1Var = new kg.i1((org.telegram.ui.ActionBar.k2) new kg.q1(q3Var), 14, false);
                i1Var.setOnDismissListener(new jg.z(8));
                i1Var.show();
                return;
            case 3:
                ((e1) this.b).G();
                return;
            case 4:
                k1 k1Var = (k1) this.b;
                ArrayList arrayList = k1Var.w;
                ArrayList arrayList2 = k1Var.s;
                l1 l1Var = k1Var.N;
                u1 u1Var = l1Var.s;
                int i12 = u1.y1;
                ui b02 = ui.b0(u1Var.a);
                String str = k1Var.H;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (l1Var.a == 1 && org.telegram.messenger.k6.d(k1Var.H)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = k1Var.H;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(u1Var.a).sendRequest(tL_messages_getStickers, new rh.h5(6, k1Var, str));
                        return;
                    }
                    String[] G0 = org.telegram.messenger.i0.G0();
                    String[] strArr = k1Var.J;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        ui.b0(u1Var.a).M(G0, false);
                    }
                    k1Var.J = G0;
                    b02.V(G0, k1Var.H, false, new q5.a(k1Var, str, b02, 8), false, false, false, true, 50);
                    return;
                }
                ArrayList i02 = b02.i0(7, false);
                k1Var.y = 0;
                arrayList2.clear();
                arrayList.clear();
                k1Var.D.clear();
                k1Var.n.clear();
                k1Var.y++;
                arrayList2.add(null);
                arrayList.add(0L);
                arrayList2.addAll(i02);
                k1Var.y = i02.size() + k1Var.y;
                k1Var.I = k1Var.H;
                k1Var.f();
                b1.z1(l1Var.b, 0, 0);
                l1Var.f.c(false);
                l1Var.e.n(false);
                return;
            case 5:
                p1 p1Var = (p1) ((rh.h0) this.b).b;
                if (p1Var.n) {
                    return;
                }
                p1Var.r.setVisibility(8);
                return;
            case 6:
                s1 s1Var = (s1) ((e6.r) this.b).b;
                ArrayList arrayList3 = s1Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                s1Var.l.e(true, 0.0f);
                int i13 = s1Var.k + 1;
                s1Var.k = i13;
                if (i13 > arrayList3.size() - 1) {
                    s1Var.k = 0;
                }
                sg.f0 f0Var = s1Var.j;
                f0Var.e((sg.o0) arrayList3.get(s1Var.k));
                s1Var.j = s1Var.i;
                s1Var.i = f0Var;
                s1Var.p.invalidate();
                return;
            case 7:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 8:
                ((h2) this.b).b(null);
                return;
            case 9:
                ((j2) this.b).E();
                return;
            case 10:
                k7 k7Var = (k7) this.b;
                if (k7Var.I) {
                    k7Var.I = false;
                    k7Var.invalidate();
                    return;
                }
                return;
            case 11:
                r4 r4Var = (r4) ((org.telegram.ui.ActionBar.m3) this.b).q;
                r4Var.Q = System.currentTimeMillis();
                r4Var.R = 0L;
                r4Var.r0 = true;
                ((o7) r4Var.a).a.J0.a(0L, true);
                r4Var.invalidate();
                return;
            case 12:
                n nVar = (n) this.b;
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    return;
                }
                return;
            case 13:
                d dVar = (d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 14:
                ((t6) ((qg.g) this.b).n).fullScroll(zs.O1);
                return;
            case 15:
                n8 n8Var = (n8) this.b;
                n8Var.g0.onTouchEvent(org.telegram.messenger.i0.R());
                n8Var.f0.I(org.telegram.messenger.i0.R());
                return;
            case 16:
                o8 o8Var = (o8) ((m2) this.b).l0;
                o8Var.u(true);
                o8Var.A0.setCameraThumb(o8Var.z());
                return;
            case 17:
                ((s7) this.b).j2.p1.setVisibility(8);
                return;
            case 18:
                t7 t7Var = (t7) this.b;
                o8 o8Var2 = t7Var.b0;
                if (o8Var2.Q1 || o8Var2.P1 || o8Var2.B0 == null || o8Var2.f0 != 0 || o8Var2.m1 == null) {
                    return;
                }
                String L0 = cd.L0(t7Var.isFrontface() ? 2131744728 : 2131744727, null);
                p2 p2Var = o8Var2.m1;
                p2Var.h = p2.a(L0, p2Var.getTextPaint());
                o8Var2.m1.s(L0);
                o8Var2.m1.u();
                vp.d1().edit().putInt("storysvddualhint", vp.d1().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 19:
                ((org.telegram.ui.Components.g9) this.b).setVisibility(8);
                return;
            case 20:
                s8 s8Var = (s8) this.b;
                try {
                    int round = Math.round(((s8Var.h * s8Var.g.getInteger("sample-rate")) / s8Var.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(s8Var.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(s8Var.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    int i14 = -1;
                    boolean z13 = false;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    short s11 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int i18 = i14;
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = s8Var.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                z10 = z12;
                                bufferInfo = bufferInfo2;
                                i11 = 8;
                                j10 = 2500;
                                try {
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    i10 = i18;
                                    z11 = z10;
                                } catch (Exception e) {
                                    e = e;
                                    org.telegram.messenger.f8.g(e, z10);
                                    return;
                                }
                            } else {
                                z11 = z13;
                                z10 = z12;
                                bufferInfo = bufferInfo2;
                                j10 = 2500;
                                i11 = 8;
                                i10 = i18;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, s8Var.f.getSampleTime(), 0);
                                s8Var.f.advance();
                            }
                        } else {
                            z11 = z13;
                            z10 = z12;
                            bufferInfo = bufferInfo2;
                            j10 = 2500;
                            i10 = i18;
                            i11 = 8;
                        }
                        if (i10 >= 0) {
                            createDecoderByType.getOutputBuffer(i10).position(0);
                        }
                        i14 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j10);
                        while (i14 != -1 && !z11) {
                            if (i14 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i14);
                                if (outputBuffer != null && bufferInfo.size > 0) {
                                    int i19 = i17;
                                    while (outputBuffer.remaining() > 0) {
                                        short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                        if (i19 >= round) {
                                            sArr[i15 - i16] = s11;
                                            int i20 = i15 + 1;
                                            int i21 = i20 - i16;
                                            if (i21 >= sArr.length || i20 >= s8Var.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0(s8Var, sArr, i21, 23));
                                                i16 = i20;
                                                sArr = sArr2;
                                            }
                                            if (i20 >= s8Var.d.length) {
                                                i17 = 0;
                                                s11 = 0;
                                                i15 = i20;
                                            } else {
                                                s10 = 0;
                                                i15 = i20;
                                                i19 = 0;
                                            }
                                        } else {
                                            s10 = s11;
                                        }
                                        s11 = s10 < s12 ? s12 : s10;
                                        i19++;
                                        int i22 = i11;
                                        if (outputBuffer.remaining() < i22) {
                                            i17 = i19;
                                        } else {
                                            outputBuffer.position(outputBuffer.position() + i22);
                                            i11 = 8;
                                        }
                                    }
                                    i17 = i19;
                                }
                                createDecoderByType.releaseOutputBuffer(i14, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    z13 = z10;
                                    int i23 = i15;
                                    synchronized (s8Var.i) {
                                        try {
                                            if (!s8Var.j) {
                                                if (!z13 && i23 < s8Var.b) {
                                                    i15 = i23;
                                                    z12 = z10;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else if (i14 == -3) {
                                createDecoderByType.getOutputBuffers();
                            }
                            i14 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                            i11 = 8;
                        }
                        z13 = z11;
                        int i232 = i15;
                        synchronized (s8Var.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    s8Var.f.release();
                    return;
                } catch (Exception e7) {
                    e = e7;
                    z10 = z12;
                }
                break;
            case 21:
                u8 u8Var = (u8) this.b;
                x8 x8Var = u8Var.c;
                if (x8Var != null) {
                    long j11 = x8Var.a;
                    if (j11 > 0) {
                        u8Var.e = j11;
                        u8Var.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                x8 x8Var2 = (x8) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = x8Var2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(x8Var2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(x8Var2.f, x8Var2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(x8Var2.f / bitmap.getWidth(), x8Var2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) c3.i0.g(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) c3.i0.g(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) c3.i0.x(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) c3.i0.x(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (x8Var2.h) {
                            if (x8Var2.m == null) {
                                x8Var2.m = new Path();
                            }
                            x8Var2.m.rewind();
                            x8Var2.m.addCircle(x8Var2.f / 2.0f, x8Var2.g / 2.0f, Math.min(x8Var2.f, x8Var2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(x8Var2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, x8Var2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
                org.telegram.messenger.i0.g3(new d1(18, x8Var2, bitmap));
                return;
            case 23:
                wh.g gVar = (wh.g) this.b;
                ku0 ku0Var = gVar.U;
                if (ku0Var == null || gVar.a0 == -1) {
                    return;
                }
                ku0Var.a();
                return;
            case 24:
                ((x2.o) this.b).k();
                return;
            case 25:
                xa.h.a((Intent) this.b);
                return;
            case 26:
                a();
                return;
            case 27:
                xa.x xVar = (xa.x) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + xVar.a.getAction() + " finishing.");
                xVar.b.trySetResult(null);
                return;
            case 28:
                ((xh.a0) this.b).invalidateSelf();
                return;
            default:
                ((xh.b0) this.b).invalidateSelf();
                return;
        }
    }

    public /* synthetic */ d0(xa.h hVar, Intent intent) {
        this.a = 25;
        this.b = intent;
    }
}

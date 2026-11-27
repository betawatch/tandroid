// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.text.Spanned;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLParseException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class s8b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s8b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] F0;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        long j;
        MediaCodec.BufferInfo bufferInfo;
        int i;
        short s;
        int i2 = -1;
        Bitmap bitmap = null;
        boolean z3 = true;
        int i3 = 0;
        switch (this.a) {
            case 0:
                t8b t8bVar = (t8b) this.b;
                if (t8bVar.w) {
                    t8bVar.F = true;
                    t8bVar.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    t8bVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    t8bVar.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    t8bVar.invalidate();
                    return;
                }
                return;
            case 1:
                c51 c51Var = (c51) this.b;
                if (c51Var != null) {
                    c51Var.setLoading(false);
                    return;
                }
                return;
            case 2:
                ((t9b) ((a3a) this.b).n).fullScroll(jn7.N1);
                return;
            case 3:
                qbb qbbVar = (qbb) this.b;
                qbbVar.h0.onTouchEvent(hl.R());
                qbbVar.g0.E(hl.R());
                return;
            case 4:
                rbb rbbVar = (rbb) ((zt4) this.b).m0;
                rbbVar.t(true);
                rbbVar.B0.setCameraThumb(rbbVar.y());
                return;
            case 5:
                wab wabVar = (wab) this.b;
                rbb rbbVar2 = wabVar.c0;
                if (rbbVar2.R1 || rbbVar2.Q1 || rbbVar2.C0 == null || rbbVar2.g0 != 0 || rbbVar2.n1 == null) {
                    return;
                }
                String M0 = ob6.M0(wabVar.isFrontface() ? 2131744367 : 2131744366, null);
                kg5 kg5Var = rbbVar2.n1;
                kg5Var.h = kg5.a(M0, kg5Var.getTextPaint());
                rbbVar2.n1.t(M0);
                rbbVar2.n1.v();
                uc7.e1().edit().putInt("storysvddualhint", uc7.e1().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 6:
                ((de0) this.b).setVisibility(8);
                return;
            case 7:
                lcb lcbVar = ((tbb) this.b).b;
                try {
                    ybb ybbVar = lcbVar.s;
                    if (ybbVar != null) {
                        if (lcbVar.b) {
                            hl.B2(ybbVar);
                        } else {
                            lcbVar.n.removeView(ybbVar);
                        }
                        lcbVar.s = null;
                        lcbVar.q();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                ((ybb) this.b).s0.O(true);
                return;
            case 9:
                zeb zebVar = (zeb) this.b;
                int i4 = zebVar.a;
                zebVar.I = null;
                xeb xebVar = zebVar.c;
                if (xebVar == null || xebVar.getEditField() == null || zebVar.c.getFieldText() == null) {
                    zebVar.s = false;
                    zebVar.w = true;
                    h8b h8bVar = zebVar.d;
                    if (h8bVar != null) {
                        h8bVar.invalidate();
                        return;
                    }
                    return;
                }
                if (zebVar.c.a()) {
                    zebVar.s = false;
                    h8b h8bVar2 = zebVar.d;
                    if (h8bVar2 != null) {
                        h8bVar2.invalidate();
                        return;
                    }
                    return;
                }
                int selectionStart = zebVar.c.getEditField().getSelectionStart();
                int selectionEnd = zebVar.c.getEditField().getSelectionEnd();
                if (selectionStart != selectionEnd) {
                    zebVar.s = false;
                    h8b h8bVar3 = zebVar.d;
                    if (h8bVar3 != null) {
                        h8bVar3.invalidate();
                        return;
                    }
                    return;
                }
                CharSequence fieldText = zebVar.c.getFieldText();
                boolean z4 = fieldText instanceof Spanned;
                mv3[] mv3VarArr = z4 ? (mv3[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, mv3.class) : null;
                if (mv3VarArr == null || mv3VarArr.length <= 0 || !xea.E || !yac.h(i4).p()) {
                    hm[] hmVarArr = z4 ? (hm[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, hm.class) : null;
                    if ((hmVarArr == null || hmVarArr.length == 0) && selectionEnd < 52) {
                        zebVar.s = true;
                        zebVar.b();
                        zebVar.W = null;
                        String substring = fieldText.toString().substring(0, selectionEnd);
                        String str = zebVar.K;
                        if (str == null || zebVar.J != 1 || !str.equals(substring) || zebVar.y || (arrayList = zebVar.x) == null || arrayList.isEmpty()) {
                            int i5 = zebVar.L + 1;
                            zebVar.L = i5;
                            long currentTimeMillis = System.currentTimeMillis();
                            if (zebVar.M == null || Math.abs(currentTimeMillis - zebVar.O) > 360) {
                                zebVar.O = currentTimeMillis;
                                F0 = hl.F0();
                            } else {
                                zebVar.O = currentTimeMillis;
                                F0 = zebVar.M;
                            }
                            String[] strArr = zebVar.M;
                            if (strArr == null || !Arrays.equals(F0, strArr)) {
                                ls6.d0(i4).O(F0, false);
                            }
                            zebVar.M = F0;
                            Runnable runnable = zebVar.N;
                            if (runnable != null) {
                                hl.r(runnable);
                                zebVar.N = null;
                            }
                            zebVar.N = new efa((Object) zebVar, (Object) F0, (Object) substring, i5, (byte) 7);
                            ArrayList arrayList3 = zebVar.x;
                            if (arrayList3 == null || arrayList3.isEmpty()) {
                                hl.d3(zebVar.N, 600L);
                            } else {
                                zebVar.N.run();
                            }
                        } else {
                            zebVar.w = false;
                            zebVar.b();
                            zebVar.d.setVisibility(0);
                            zebVar.a0 = hl.L(10.0f);
                            zebVar.d.invalidate();
                        }
                        h8b h8bVar4 = zebVar.d;
                        if (h8bVar4 != null) {
                            h8bVar4.invalidate();
                            return;
                        }
                        return;
                    }
                } else {
                    mv3 mv3Var = mv3VarArr[mv3VarArr.length - 1];
                    if (mv3Var != null) {
                        Spanned spanned = (Spanned) fieldText;
                        int spanStart = spanned.getSpanStart(mv3Var);
                        int spanEnd = spanned.getSpanEnd(mv3Var);
                        if (selectionStart == spanEnd) {
                            String substring2 = fieldText.toString().substring(spanStart, spanEnd);
                            zebVar.s = true;
                            zebVar.b();
                            zebVar.W = mv3Var;
                            zebVar.c0 = null;
                            zebVar.b0 = null;
                            String str2 = zebVar.K;
                            if (str2 == null || zebVar.J != 2 || !str2.equals(substring2) || zebVar.y || (arrayList2 = zebVar.x) == null || arrayList2.isEmpty()) {
                                int i6 = zebVar.L + 1;
                                zebVar.L = i6;
                                Runnable runnable2 = zebVar.N;
                                if (runnable2 != null) {
                                    hl.r(runnable2);
                                }
                                zebVar.N = new a39((Object) zebVar, (Object) substring2, i6, (byte) 22);
                                ArrayList arrayList4 = zebVar.x;
                                if (arrayList4 == null || arrayList4.isEmpty()) {
                                    hl.d3(zebVar.N, 600L);
                                } else {
                                    zebVar.N.run();
                                }
                            } else {
                                zebVar.w = false;
                                zebVar.b();
                                h8b h8bVar5 = zebVar.d;
                                if (h8bVar5 != null) {
                                    h8bVar5.setVisibility(0);
                                    zebVar.d.invalidate();
                                }
                            }
                            h8b h8bVar6 = zebVar.d;
                            if (h8bVar6 != null) {
                                h8bVar6.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                }
                Runnable runnable3 = zebVar.N;
                if (runnable3 != null) {
                    hl.r(runnable3);
                    zebVar.N = null;
                }
                zebVar.s = false;
                h8b h8bVar7 = zebVar.d;
                if (h8bVar7 != null) {
                    h8bVar7.invalidate();
                    return;
                }
                return;
            case 10:
                lgb lgbVar = (lgb) this.b;
                lgbVar.L = null;
                lgbVar.b();
                return;
            case 11:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                return;
            case 12:
                thb thbVar = (thb) this.b;
                wka wkaVar = thbVar.V;
                if (wkaVar == null || thbVar.b0 == -1) {
                    return;
                }
                wkaVar.a();
                return;
            case 13:
                dkb dkbVar = (dkb) this.b;
                rx6 rx6Var = dkbVar.b;
                int i7 = yac.t0;
                dkbVar.c = i7;
                dkbVar.d = hl.a1(uc7.s1(i7).W3, "auto_lastSelectedDialog", 0L);
                dkbVar.e = false;
                dkbVar.f = false;
                dkbVar.g.clear();
                dkbVar.h.b();
                dkbVar.i.b();
                dkbVar.j.b();
                dkbVar.k.b();
                dkbVar.l.b();
                try {
                    rx6Var.t0(null);
                    ((ex6) rx6Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 14:
                jn7.f(((ckb) this.b).g.c).k(jn7.g2, 0);
                return;
            case 15:
                hl.E3(((rlb) this.b).s0);
                return;
            case 16:
                mmb mmbVar = (mmb) this.b;
                mmbVar.C.invalidate();
                mmbVar.R();
                return;
            case 17:
                ((mmb) ((ut3) this.b).c).R();
                return;
            case 18:
                ((pmb) this.b).a();
                return;
            case 19:
                anb anbVar = (anb) this.b;
                anbVar.P = true;
                anbVar.M.onFirstFrameRendered();
                return;
            case 20:
                ArrayList arrayList5 = ((enb) this.b).a;
                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                    ((View) arrayList5.get(i8)).setVisibility(8);
                    if (arrayList5.get(i8) instanceof wb2) {
                        ((wb2) arrayList5.get(i8)).m3(false, false);
                        ((wb2) arrayList5.get(i8)).o3(false, false, false);
                    }
                }
                return;
            case 21:
                Drawable drawable = (Drawable) this.b;
                aob.d = null;
                aob.O();
                if (!aob.b) {
                    aob.i(drawable);
                    aob.g(drawable);
                }
                jn7.e().k(jn7.C4, new Object[0]);
                return;
            case 22:
                sqb sqbVar = (sqb) this.b;
                sqbVar.y = -1;
                while (true) {
                    wb2[] wb2VarArr = sqbVar.n;
                    if (i3 >= wb2VarArr.length) {
                        return;
                    }
                    wb2 wb2Var = wb2VarArr[i3];
                    if (wb2Var != null) {
                        wb2Var.invalidate();
                    }
                    i3++;
                }
            case 23:
                zqb zqbVar = (zqb) this.b;
                zqbVar.K = null;
                zqbVar.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(k43.f).start();
                return;
            case 24:
                dsb dsbVar = (dsb) this.b;
                try {
                    int round = Math.round(((dsbVar.h * dsbVar.g.getInteger("sample-rate")) / dsbVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(dsbVar.g.getString("mime"));
                    if (createDecoderByType != null) {
                        createDecoderByType.configure(dsbVar.g, (Surface) null, (MediaCrypto) null, 0);
                        createDecoderByType.start();
                        createDecoderByType.getInputBuffers();
                        createDecoderByType.getOutputBuffers();
                        short[] sArr = new short[32];
                        int i9 = -1;
                        boolean z5 = false;
                        int i10 = 0;
                        int i11 = 0;
                        int i12 = 0;
                        short s2 = 0;
                        while (true) {
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                            if (dequeueInputBuffer >= 0) {
                                int readSampleData = dsbVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                                if (readSampleData < 0) {
                                    j = 2500;
                                    i = 8;
                                    try {
                                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                        z = z3;
                                        bufferInfo = bufferInfo2;
                                        z5 = z;
                                    } catch (Exception e) {
                                        e = e;
                                        z2 = z3;
                                        cc4.g(e, z2);
                                        return;
                                    }
                                } else {
                                    j = 2500;
                                    i = 8;
                                    z = z3;
                                    bufferInfo = bufferInfo2;
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, dsbVar.f.getSampleTime(), 0);
                                    dsbVar.f.advance();
                                }
                            } else {
                                z = z3;
                                j = 2500;
                                bufferInfo = bufferInfo2;
                                i = 8;
                            }
                            if (i9 >= 0) {
                                try {
                                    createDecoderByType.getOutputBuffer(i9).position(0);
                                } catch (Exception e2) {
                                    e = e2;
                                    z2 = z;
                                    cc4.g(e, z2);
                                    return;
                                }
                            }
                            i9 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                            while (true) {
                                if (i9 != i2 && !z5) {
                                    if (i9 >= 0) {
                                        ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i9);
                                        if (outputBuffer != null && bufferInfo.size > 0) {
                                            int i13 = i12;
                                            while (outputBuffer.remaining() > 0) {
                                                short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                                if (i13 >= round) {
                                                    sArr[i10 - i11] = s2;
                                                    i10++;
                                                    int i14 = i10 - i11;
                                                    if (i14 >= sArr.length || i10 >= dsbVar.b) {
                                                        short[] sArr2 = new short[sArr.length];
                                                        hl.c3(new a39((Object) dsbVar, (Object) sArr, i14, (byte) 26));
                                                        i11 = i10;
                                                        sArr = sArr2;
                                                    }
                                                    if (i10 >= dsbVar.d.length) {
                                                        i12 = 0;
                                                        s2 = 0;
                                                    } else {
                                                        s = 0;
                                                        i13 = 0;
                                                    }
                                                } else {
                                                    s = s2;
                                                }
                                                s2 = s < s3 ? s3 : s;
                                                i13++;
                                                int i15 = i;
                                                if (outputBuffer.remaining() >= i15) {
                                                    outputBuffer.position(outputBuffer.position() + i15);
                                                    i = 8;
                                                } else {
                                                    i12 = i13;
                                                }
                                            }
                                            i12 = i13;
                                        }
                                        createDecoderByType.releaseOutputBuffer(i9, false);
                                        if ((bufferInfo.flags & 4) != 0) {
                                            z5 = z;
                                        }
                                    } else if (i9 == -3) {
                                        createDecoderByType.getOutputBuffers();
                                    }
                                    i9 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                    i2 = -1;
                                    i = 8;
                                }
                            }
                            synchronized (dsbVar.i) {
                                if (!dsbVar.j) {
                                    if (!z5 && i10 < dsbVar.b) {
                                        z3 = z;
                                        i2 = -1;
                                    }
                                }
                            }
                        }
                        createDecoderByType.stop();
                        createDecoderByType.release();
                        dsbVar.f.release();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    e = e3;
                    z = z3;
                }
                break;
            case 25:
                fsb fsbVar = (fsb) this.b;
                isb isbVar = fsbVar.c;
                if (isbVar != null) {
                    long j2 = isbVar.a;
                    if (j2 > 0) {
                        fsbVar.e = j2;
                        fsbVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                isb isbVar2 = (isb) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = isbVar2.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(isbVar2.j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(isbVar2.f, isbVar2.g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(isbVar2.f / bitmap.getWidth(), isbVar2.g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) ((createBitmap.getWidth() - (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() - (bitmap.getHeight() * max)) / 2.0f), (int) (((bitmap.getWidth() * max) + createBitmap.getWidth()) / 2.0f), (int) (((bitmap.getHeight() * max) + createBitmap.getHeight()) / 2.0f));
                            if (isbVar2.h) {
                                Path path = isbVar2.m;
                                if (path == null) {
                                    path = new Path();
                                    isbVar2.m = path;
                                }
                                path.rewind();
                                isbVar2.m.addCircle(isbVar2.f / 2.0f, isbVar2.g / 2.0f, Math.min(isbVar2.f, isbVar2.g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(isbVar2.m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, isbVar2.l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                    }
                    hl.c3(new bcb((Object) isbVar2, (Object) bitmap, (byte) 10));
                    return;
                }
                return;
            case 27:
                kxb kxbVar = (kxb) this.b;
                ViewPropertyAnimator duration = kxbVar.animate().alpha(0.0f).setListener(new omb(kxbVar, (byte) 3)).setDuration(300L);
                kxbVar.b = duration;
                duration.start();
                return;
            case 28:
                ayb aybVar = (ayb) this.b;
                pcc pccVar = aybVar.b;
                if (pccVar != null) {
                    pccVar.a(Long.valueOf(aybVar.a.t));
                    return;
                }
                return;
            default:
                ((uyb) this.b).J.r.f();
                return;
        }
    }
}

package rh;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        z8.n nVar = (z8.n) this.b;
        y9.b bVar = (y9.b) this.c;
        synchronized (nVar) {
            try {
                if (nVar.b == null) {
                    nVar.a.add(bVar);
                } else {
                    nVar.b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View z12;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        y9.a aVar;
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.b;
                y1 y1Var = (y1) this.c;
                p3Var.getClass();
                long j10 = y1Var.a;
                int i10 = y1Var.d;
                int i11 = y1Var.c;
                ArrayList arrayList = p3Var.h3;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                    } else if (((a) arrayList.get(i12)).a != j10) {
                        i12++;
                    }
                }
                if (i12 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = p3Var.T2.m(i12);
                if (m10 instanceof t5) {
                    t5 t5Var = (t5) m10;
                    t5Var.B();
                    d1 editText = t5Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i11, length)), Math.max(0, Math.min(i10, length)));
                    return;
                }
                if (!(m10 instanceof g5)) {
                    if (m10 instanceof i0) {
                        d1 captionEditText = ((i0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i11, length2)), Math.max(0, Math.min(i10, length2)));
                        return;
                    }
                    return;
                }
                g5 g5Var = (g5) m10;
                d1 l10 = g5Var.l(y1Var.b);
                if (l10 == null) {
                    l10 = g5Var.l(0);
                }
                if (l10 == null) {
                    return;
                }
                l10.r();
                int length3 = l10.length();
                l10.setSelection(Math.max(0, Math.min(i11, length3)), Math.max(0, Math.min(i10, length3)));
                return;
            case 1:
                g3 g3Var = (g3) this.b;
                a aVar2 = (a) this.c;
                if (aVar2 == null) {
                    g3Var.getClass();
                    z12 = null;
                } else {
                    z12 = g3Var.e.z1(aVar2);
                }
                if (z12 instanceof t5) {
                    t5 t5Var2 = (t5) z12;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(t5Var2.getEditText().length());
                    return;
                }
                return;
            case 2:
                s4 s4Var = (s4) this.b;
                TLObject tLObject = (TLObject) this.c;
                boolean z10 = s4Var.e;
                boolean z11 = s4Var.d;
                r4 r4Var = s4Var.s;
                if (s4Var.w) {
                    return;
                }
                s4Var.y = 0;
                if (s4Var.c || z11 || z10) {
                    if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (!z10) {
                            if (z11) {
                                s4Var.x = true;
                                s4Var.e();
                                r4Var.e(document);
                                return;
                            } else {
                                s4Var.x = true;
                                s4Var.e();
                                r4Var.c(document);
                                return;
                            }
                        }
                        int i13 = s4Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            s4Var.x = true;
                            s4Var.e();
                            r4Var.onError();
                            return;
                        }
                        s4Var.x = true;
                        s4Var.e();
                        if (!TextUtils.isEmpty(s4Var.B) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i13).setLocalPathTo(closestPhotoSizeWithSize, s4Var.B);
                            AndroidUtilities.copyFileSafe(new File(s4Var.B), FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        r4Var.d(document);
                        return;
                    }
                } else if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                    s4Var.x = true;
                    s4Var.e();
                    r4Var.b(photo);
                    return;
                }
                s4Var.x = true;
                s4Var.e();
                r4Var.onError();
                return;
            case 3:
                s4 s4Var2 = (s4) this.b;
                String str = (String) this.c;
                if (s4Var2.w || s4Var2.x) {
                    return;
                }
                s4Var2.a(str);
                return;
            case 4:
                j5 m11 = ((g5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m11 == null) {
                    return;
                }
                d1 d1Var = m11.a;
                d1Var.r();
                d1Var.setSelection(d1Var.length());
                return;
            case 5:
                vd.b bVar = (vd.b) this.b;
                View view = (View) this.c;
                vd.a aVar3 = bVar.a;
                if ((bVar.c & 2) != 0) {
                    if (!aVar3.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
                        bVar.c |= 8;
                        return;
                    }
                    bVar.c &= -3;
                    bVar.b = null;
                    float f10 = bVar.d;
                    float f11 = bVar.e;
                    bVar.f = f10;
                    bVar.g = f11;
                    if (aVar3.ignoreHapticFeedbackSettings(f10, f11)) {
                        boolean forceEnableVibration = aVar3.forceEnableVibration();
                        if (view != null) {
                            view.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view.performHapticFeedback(0);
                    }
                    bVar.c = (bVar.c | 4) & (-11);
                    bVar.b = null;
                    return;
                }
                return;
            case 6:
                yf.p0 p0Var = (yf.p0) this.b;
                yf.w0 w0Var = (yf.w0) this.c;
                p0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) p0Var.h(p0Var.f(), true, false, false).c;
                RectF f12 = p0Var.f();
                Object obj = p0Var.a.b;
                p0Var.w = new b6.a(byteBuffer, 0, f12);
                p0Var.a(false);
                w0Var.run();
                return;
            case 7:
                yf.b1 b1Var = (yf.b1) this.b;
                Runnable runnable = (Runnable) this.c;
                yf.z0 z0Var = b1Var.d;
                if (z0Var == null || !z0Var.f) {
                    return;
                }
                yf.z0.b(z0Var);
                runnable.run();
                return;
            case 8:
                z8.o oVar = (z8.o) this.b;
                y9.b bVar2 = (y9.b) this.c;
                if (oVar.b != z8.o.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    aVar = oVar.a;
                    oVar.a = null;
                    oVar.b = bVar2;
                }
                aVar.b(bVar2);
                return;
            case 9:
                a();
                return;
            case 10:
                zf.l0 l0Var = (zf.l0) this.b;
                zf.x1 x1Var = (zf.x1) this.c;
                x1Var.m();
                l0Var.r0(x1Var, true);
                return;
            case 11:
                ((zf.x1) this.b).s((Bitmap) this.c);
                return;
            default:
                zf.n2 n2Var = (zf.n2) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                n2Var.C = false;
                zf.k2[] k2VarArr = (zf.k2[]) arrayList2.toArray(new zf.k2[0]);
                n2Var.D = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.U.setScaleX(0.3f);
                    n2Var.U.setScaleY(0.3f);
                    n2Var.U.setAlpha(0.0f);
                    n2Var.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(er.f).start();
                    return;
                }
                return;
        }
    }
}

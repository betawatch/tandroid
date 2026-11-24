// default package

import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.scilab.forge.jlatexmath.ParseException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qn0 implements ee, pac, gka, hka, k01, gla, t89, dja, xgc, e59, mm0, gk, ln5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ qn0(sd1 sd1Var, int i, g41 g41Var) {
        this.a = (byte) 16;
    }

    public static /* bridge */ /* synthetic */ RenderNode c(Object obj) {
        return (RenderNode) obj;
    }

    public static /* synthetic */ void g(String str) {
        throw new ParseException(str);
    }

    @Override // xgc
    public final void a(View view, RectF rectF) {
        view.invalidate();
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Drawable t = imageReceiver.t();
        if (t instanceof p09) {
            p09 p09Var = (p09) t;
            p09Var.K(0);
            p09Var.stop();
            p09Var.O(false, 0.0f);
        }
    }

    @Override // t89
    public final void call() {
        throw null;
    }

    @Override // hka
    public final void d(Object obj, float f) {
        switch (this.a) {
            case 8:
                wx0 wx0Var = (wx0) obj;
                wx0Var.c = f;
                wx0Var.f.invalidate();
                wx0Var.Y.setAlpha(f);
                wx0Var.J();
                wx0Var.H();
                break;
            case 27:
                ((x22) obj).setLoadProgress(f);
                break;
            default:
                ((d32) obj).setSwipeOffsetY(f);
                break;
        }
    }

    @Override // dja
    public final float f(RecyclerView recyclerView) {
        return fja.j(recyclerView);
    }

    @Override // gka
    public final float get(Object obj) {
        switch (this.a) {
            case 7:
                return ((wx0) obj).c;
            case 26:
                return ((x22) obj).c;
            default:
                return ((d32) obj).getSwipeOffsetY();
        }
    }

    @Override // dja
    public final RecyclerView h(View view) {
        return ((ck1) view).a;
    }

    @Override // gla
    public final void i(int i) {
        if (i == 0) {
            gda.z(3);
            return;
        }
        if (i == 1) {
            gda.z(0);
        } else if (i == 2) {
            gda.z(1);
        } else if (i == 3) {
            gda.z(2);
        }
    }

    @Override // mm0
    public final int o(ylb ylbVar, boolean z) {
        return TLObject.FLAG_31;
    }

    @Override // dja
    public final /* synthetic */ void q(RecyclerView recyclerView) {
        hg9.d(recyclerView);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                heVar.dismiss();
                break;
            case 1:
                heVar.dismiss();
                break;
            case 5:
                heVar.dismiss();
                break;
            case 6:
                heVar.dismiss();
                break;
            case 13:
                heVar.dismiss();
                break;
            default:
                heVar.dismiss();
                break;
        }
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 23:
                MediaController.w().A0(1, i, z, false);
                break;
            default:
                MediaController.w().A0(1, i, z, false);
                break;
        }
    }

    public /* synthetic */ qn0(byte b) {
        this.a = b;
    }

    public /* synthetic */ qn0(Object obj, byte b) {
        this.a = b;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override // k01
    public final void cancel() {
    }

    @Override // gla
    public final void m() {
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }
}

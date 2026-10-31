package vh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.we;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m2 extends k2 {
    public final /* synthetic */ int k0 = 0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(int i10, Context context, th.b bVar, float f7, String str) {
        super(i10, context, bVar, null, true, f7, false, false);
        this.l0 = str;
    }

    @Override // vh.k2
    public void a() {
        switch (this.k0) {
            case 1:
                o8 o8Var = (o8) this.l0;
                o8Var.M0.setTranslationY(o8Var.n.getMeasuredHeight() - o8Var.M0.g());
                g7 g7Var = o8Var.q2;
                if (g7Var != null) {
                    g7Var.run();
                    o8Var.q2 = null;
                    break;
                }
                break;
        }
    }

    @Override // vh.k2
    public void c(boolean z10) {
        switch (this.k0) {
            case 1:
                if (((o8) this.l0).f0 == 0 && z10) {
                    org.telegram.messenger.i0.g3(new d0(this, 16));
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.k0) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                o8 o8Var = (o8) this.l0;
                o8Var.L0 = true;
                o8Var.e(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // vh.k2
    public String getTitle() {
        switch (this.k0) {
            case 0:
                return (String) this.l0;
            default:
                return super.getTitle();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.k0) {
            case 1:
                super.setTranslationY(f7);
                o8 o8Var = (o8) this.l0;
                if (o8Var.k2) {
                    float i10 = Utilities.i(1.0f - (f7 / (o8Var.n.getMeasuredHeight() - o8Var.M0.g())), 1.0f, 0.0f);
                    o8Var.r.b(org.telegram.messenger.i0.L(-32.0f) * i10);
                    o8Var.r.setAlpha(1.0f - (0.6f * i10));
                    o8Var.i0.setAlpha(1.0f - i10);
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(o8 o8Var, int i10, Context context, th.b bVar, we weVar, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, weVar, z10, 1.39f, z11, z12);
        this.l0 = o8Var;
    }
}

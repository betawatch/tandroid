// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class zt4 extends wt4 {
    public final /* synthetic */ byte l0 = 0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt4(int i, Context context, x53 x53Var, float f, String str) {
        super(i, context, x53Var, null, true, f, false, false);
        this.m0 = str;
    }

    @Override // wt4
    public final void a() {
        switch (this.l0) {
            case 1:
                sbb sbbVar = (sbb) this.m0;
                sbbVar.N0.setTranslationY(sbbVar.n.getMeasuredHeight() - sbbVar.N0.g());
                lab labVar = sbbVar.r2;
                if (labVar != null) {
                    labVar.run();
                    sbbVar.r2 = null;
                    break;
                }
                break;
        }
    }

    @Override // wt4
    public final void c(boolean z) {
        switch (this.l0) {
            case 1:
                if (((sbb) this.m0).g0 == 0 && z) {
                    hl.c3(new s8b(this, (byte) 4));
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.l0) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                sbb sbbVar = (sbb) this.m0;
                sbbVar.M0 = true;
                sbbVar.c(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // wt4
    public final String getTitle() {
        switch (this.l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.l0) {
            case 1:
                super.setTranslationY(f);
                sbb sbbVar = (sbb) this.m0;
                if (sbbVar.l2) {
                    float i = Utilities.i(1.0f - (f / (sbbVar.n.getMeasuredHeight() - sbbVar.N0.g())), 1.0f, 0.0f);
                    sbbVar.r.b(hl.L(-32.0f) * i);
                    sbbVar.r.setAlpha(1.0f - (0.6f * i));
                    sbbVar.j0.setAlpha(1.0f - i);
                    break;
                }
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt4(sbb sbbVar, int i, Context context, x53 x53Var, do6 do6Var, boolean z, boolean z2, boolean z3) {
        super(i, context, x53Var, do6Var, z, 1.39f, z2, z3);
        this.m0 = sbbVar;
    }
}

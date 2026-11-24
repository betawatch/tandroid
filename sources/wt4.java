// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class wt4 extends tt4 {
    public final /* synthetic */ byte l0 = 0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt4(int i, Context context, r63 r63Var, float f, String str) {
        super(i, context, r63Var, null, true, f, false, false);
        this.m0 = str;
    }

    @Override // tt4
    public final void a() {
        switch (this.l0) {
            case 1:
                v9b v9bVar = (v9b) this.m0;
                v9bVar.N0.setTranslationY(v9bVar.n.getMeasuredHeight() - v9bVar.N0.g());
                n8b n8bVar = v9bVar.r2;
                if (n8bVar != null) {
                    n8bVar.run();
                    v9bVar.r2 = null;
                    break;
                }
                break;
        }
    }

    @Override // tt4
    public final void c(boolean z) {
        switch (this.l0) {
            case 1:
                if (((v9b) this.m0).g0 == 0 && z) {
                    gm.c3(new nsa((Object) this, (byte) 25));
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
                v9b v9bVar = (v9b) this.m0;
                v9bVar.M0 = true;
                v9bVar.c(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // tt4
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
                v9b v9bVar = (v9b) this.m0;
                if (v9bVar.l2) {
                    float i = Utilities.i(1.0f - (f / (v9bVar.n.getMeasuredHeight() - v9bVar.N0.g())), 1.0f, 0.0f);
                    v9bVar.r.b(gm.L(-32.0f) * i);
                    v9bVar.r.setAlpha(1.0f - (0.6f * i));
                    v9bVar.j0.setAlpha(1.0f - i);
                    break;
                }
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt4(v9b v9bVar, int i, Context context, r63 r63Var, yn6 yn6Var, boolean z, boolean z2, boolean z3) {
        super(i, context, r63Var, yn6Var, z, 1.39f, z2, z3);
        this.m0 = v9bVar;
    }
}

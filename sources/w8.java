// default package

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w8 extends qo4 {
    public final /* synthetic */ byte s = 1;
    public final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.w = actionMenuItemView;
    }

    @Override // qo4
    public final xia b() {
        y8 y8Var;
        byte b = this.s;
        View view = this.w;
        switch (b) {
            case 0:
                x8 x8Var = ((ActionMenuItemView) view).y;
                if (x8Var == null || (y8Var = ((z8) x8Var).a.K) == null) {
                    return null;
                }
                return y8Var.a();
            default:
                y8 y8Var2 = ((a9) view).d.J;
                if (y8Var2 != null) {
                    return y8Var2.a();
                }
                return null;
        }
    }

    @Override // qo4
    public final boolean c() {
        xia b;
        byte b2 = this.s;
        View view = this.w;
        switch (b2) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                x17 x17Var = actionMenuItemView.w;
                if (x17Var == null || !x17Var.a(actionMenuItemView.n) || (b = b()) == null || !b.a()) {
                }
                break;
            default:
                ((a9) view).d.l();
                break;
        }
        return true;
    }

    @Override // qo4
    public final boolean d() {
        switch (this.s) {
            case 1:
                b9 b9Var = ((a9) this.w).d;
                if (b9Var.L != null) {
                    return false;
                }
                b9Var.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(a9 a9Var, a9 a9Var2) {
        super(a9Var2);
        this.w = a9Var;
    }
}

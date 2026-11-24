// default package

import android.content.Context;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zu2 extends ev2 {
    public final /* synthetic */ ContactsActivity P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu2(ContactsActivity contactsActivity, Context context, int i, boolean z, vh6 vh6Var, int i2) {
        super(context, i, z, vh6Var, i2);
        this.P = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // m59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z;
        boolean z2;
        zja zjaVar;
        boolean z3 = false;
        this.J = false;
        byte b = this.G;
        int i = this.r;
        int i2 = this.w;
        int i3 = 2;
        if (b != 2) {
            size = (i2 == 2 ? bw2.r(i).k0 : bw2.r(i).i0).size();
            if (size == 0) {
                this.J = true;
            }
            if (i2 == 0) {
                size++;
            }
            z = this.F;
            if (z) {
                size++;
            }
            boolean isEmpty = bw2.r(i).b0.isEmpty();
            this.K = !isEmpty;
            z2 = !this.J && this.x && !z && i2 == 0;
            this.L = z2;
            if (z2) {
                i3 = size;
            } else if (isEmpty) {
                i3 = 1;
            }
            ContactsActivity contactsActivity = this.P;
            contactsActivity.f0();
            zjaVar = contactsActivity.n;
            if (zjaVar != null) {
                zu2 zu2Var = contactsActivity.b;
                if (zu2Var != null && !zu2Var.J) {
                    z3 = true;
                }
                zjaVar.Y(z3, true);
            }
            contactsActivity.g0();
            return i3;
        }
        this.J = this.E.isEmpty();
        size = 1;
        if (i2 == 0) {
        }
        z = this.F;
        if (z) {
        }
        boolean isEmpty2 = bw2.r(i).b0.isEmpty();
        this.K = !isEmpty2;
        if (this.J) {
        }
        this.L = z2;
        if (z2) {
        }
        ContactsActivity contactsActivity2 = this.P;
        contactsActivity2.f0();
        zjaVar = contactsActivity2.n;
        if (zjaVar != null) {
        }
        contactsActivity2.g0();
        return i3;
    }

    @Override // m59, y59
    public final void f() {
        X(false);
        ContactsActivity contactsActivity = this.P;
        r59 r59Var = contactsActivity.d;
        if (r59Var == null || r59Var.getAdapter() != this) {
            return;
        }
        int b = b();
        boolean z = contactsActivity.G;
        r59 r59Var2 = contactsActivity.d;
        if (z) {
            r59Var2.setFastScrollVisible(b != 2);
        } else {
            r59Var2.setFastScrollVisible(b != 0);
        }
    }
}

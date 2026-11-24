// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yu2 extends ut9 {
    public final /* synthetic */ ContactsActivity L;

    public yu2(ContactsActivity contactsActivity, Context context, vh6 vh6Var, boolean z, boolean z2, boolean z3) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.I = new ArrayList();
        this.c = context;
        this.h = vh6Var;
        this.r = z;
        this.s = z2;
        this.y = 0L;
        this.w = z3;
        this.x = true;
        bu9 bu9Var = new bu9(true);
        this.f = bu9Var;
        bu9Var.a = new st9(this);
    }

    @Override // ut9
    public final void F() {
        if (this.E || this.f.e() || b() != 0) {
            return;
        }
        this.L.c.e(false, true);
    }
}

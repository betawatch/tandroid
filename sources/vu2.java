// default package

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vu2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ vu2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ContactsActivity contactsActivity = this.b;
        switch (b) {
            case 0:
                h94 h94Var = contactsActivity.a;
                h94Var.c(contactsActivity.r ? 0.0f : 1.0f);
                zu2 zu2Var = contactsActivity.b;
                float f = h94Var.f;
                ArrayList arrayList = zu2Var.O;
                zu2Var.M = f;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((p26) arrayList.get(i)).setLetterProgress(f);
                }
                byte b2 = 1;
                contactsActivity.b.Y(contactsActivity.r ? 1 : 2, false);
                contactsActivity.d.w0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(d53.h).withEndAction(new vu2(contactsActivity, b2));
                contactsActivity.f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    h94Var.e = (byte) 80;
                    h94Var.a(1.0f);
                    break;
                }
                break;
            default:
                contactsActivity.f0 = null;
                break;
        }
    }
}

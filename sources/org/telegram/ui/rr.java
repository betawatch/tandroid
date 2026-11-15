package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ rr(ContactsActivity contactsActivity, int i7) {
        this.a = i7;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                te.c cVar = contactsActivity.a;
                cVar.c(contactsActivity.r ? 0.0f : 1.0f);
                vr vrVar = contactsActivity.b;
                float f10 = cVar.f;
                ArrayList arrayList = vrVar.O;
                vrVar.M = f10;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i7)).setLetterProgress(f10);
                }
                contactsActivity.b.Y(contactsActivity.r ? 1 : 2, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new rr(contactsActivity, 1));
                contactsActivity.f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    cVar.e = 80L;
                    cVar.a(1.0f);
                    break;
                }
                break;
            default:
                this.b.f0 = null;
                break;
        }
    }
}

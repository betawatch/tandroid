package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ sr(ContactsActivity contactsActivity, int i7) {
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
                ArrayList arrayList = vrVar.N;
                vrVar.L = f10;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i7)).setLetterProgress(f10);
                }
                contactsActivity.b.Y(contactsActivity.r ? 1 : 2, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.wq.h).withEndAction(new sr(contactsActivity, 1));
                contactsActivity.e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.r) {
                    cVar.e = 80L;
                    cVar.a(1.0f);
                    break;
                }
                break;
            default:
                this.b.e0 = null;
                break;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ vs(ContactsActivity contactsActivity, int i10) {
        this.a = i10;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.getClass();
                contactsActivity.b0 = i10 != 0;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.W(this.b, i10);
                break;
        }
    }
}

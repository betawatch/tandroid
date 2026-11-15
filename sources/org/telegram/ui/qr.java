package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements org.telegram.messenger.pr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ qr(ContactsActivity contactsActivity, int i7) {
        this.a = i7;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.pr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.getClass();
                contactsActivity.Y = i7 != 0;
                if (i7 != 0) {
                    contactsActivity.h0(false);
                    break;
                }
                break;
            default:
                ContactsActivity.a0(this.b, i7);
                break;
        }
    }
}

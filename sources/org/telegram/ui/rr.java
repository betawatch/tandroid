package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements org.telegram.messenger.or {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ rr(ContactsActivity contactsActivity, int i7) {
        this.a = i7;
        this.b = contactsActivity;
    }

    @Override // org.telegram.messenger.or
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

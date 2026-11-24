// default package

import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uu2 implements we7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ uu2(ContactsActivity contactsActivity, byte b) {
        this.a = b;
        this.b = contactsActivity;
    }

    @Override // we7
    public final void a(int i) {
        byte b = this.a;
        ContactsActivity contactsActivity = this.b;
        switch (b) {
            case 0:
                contactsActivity.Y = i != 0;
                if (i != 0) {
                    contactsActivity.c0(false);
                    break;
                }
                break;
            default:
                contactsActivity.j0(i);
                break;
        }
    }
}

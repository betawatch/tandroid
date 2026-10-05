package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ss implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsActivity b;

    public /* synthetic */ ss(ContactsActivity contactsActivity, int i10) {
        this.a = i10;
        this.b = contactsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g0();
                break;
            default:
                ContactsActivity contactsActivity = this.b;
                contactsActivity.f.postOnAnimation(new ss(contactsActivity, 0));
                break;
        }
    }
}

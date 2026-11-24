// default package

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pt2 extends i49 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public pt2(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        if (i != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.E && contactsActivity.y) {
            gl.t1(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s == null || contactsActivity.E) {
            return;
        }
        boolean z = i2 > 0;
        if (i2 != 0 && this.a && (z || this.b)) {
            contactsActivity.w = !z;
            contactsActivity.e0();
        }
        this.a = true;
    }
}

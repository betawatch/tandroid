package pg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ij;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a {
    public RecyclerView a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        if (messageObject.getId() != this.b) {
            return this.c != 0 && messageObject.getGroupId() == this.c;
        }
        return true;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c(int i9, long j10) {
        if (this.b == i9 && this.c == j10) {
            return false;
        }
        this.b = i9;
        this.c = j10;
        if (i9 != 0) {
            return true;
        }
        this.e = false;
        return true;
    }

    public final void d(int i9) {
        this.d = i9;
    }

    public final void e(ij ijVar) {
        this.a = ijVar;
    }
}

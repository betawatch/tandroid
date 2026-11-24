// default package

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p96 implements o96 {
    public final LocaleList a;

    public p96(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // o96
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // o96
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((o96) obj).b());
    }

    @Override // o96
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // o96
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}

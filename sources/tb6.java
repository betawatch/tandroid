// default package

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class tb6 implements sb6 {
    public final LocaleList a;

    public tb6(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // sb6
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // sb6
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((sb6) obj).b());
    }

    @Override // sb6
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // sb6
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}

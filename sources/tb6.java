// default package

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

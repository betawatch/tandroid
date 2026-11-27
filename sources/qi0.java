// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qi0 {
    public final int a;
    public final CharSequence b;

    public qi0(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qi0)) {
            return false;
        }
        qi0 qi0Var = (qi0) obj;
        if (this.a != qi0Var.a) {
            return false;
        }
        CharSequence charSequence = qi0Var.b;
        CharSequence charSequence2 = this.b;
        String charSequence3 = charSequence2 != null ? charSequence2.toString() : null;
        String charSequence4 = charSequence != null ? charSequence.toString() : null;
        return charSequence3 == null ? charSequence4 == null : charSequence3.equals(charSequence4);
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}

// default package

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class v1a {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v1a.class == obj.getClass()) {
                v1a v1aVar = (v1a) obj;
                boolean z = (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(v1aVar.c)) || Objects.equals(this.c, v1aVar.c);
                if (this.a != v1aVar.a || this.b != v1aVar.b || !z) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c);
    }
}

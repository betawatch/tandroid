package s4;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements r4.f {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ j(int i9, List list) {
        this.a = i9;
        this.b = list;
    }

    @Override // r4.f
    public final int b(long j10) {
        switch (this.a) {
            case 0:
                if (j10 < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // r4.f
    public final long h(int i9) {
        switch (this.a) {
            case 0:
                d5.a.f(i9 == 0);
                break;
        }
        return 0L;
    }

    @Override // r4.f
    public final List m(long j10) {
        switch (this.a) {
            case 0:
                return j10 >= 0 ? this.b : Collections.EMPTY_LIST;
            default:
                return this.b;
        }
    }

    @Override // r4.f
    public final int r() {
        switch (this.a) {
        }
        return 1;
    }
}

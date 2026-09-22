package z5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {
    public static final /* synthetic */ c b = new c(0);
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((Scope) obj).b.compareTo(((Scope) obj2).b);
    }
}

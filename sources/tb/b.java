package tb;

import a8.r7;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import q6.m;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements u9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    @Override // u9.d
    public final Object e(r7 r7Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(r7Var.L(sb.a.class));
                m.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) r7Var.a(Context.class), (sb.a) arrayList.get(0));
            default:
                return new a((e) r7Var.a(e.class), (pb.d) r7Var.a(pb.d.class));
        }
    }
}

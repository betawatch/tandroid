package wb;

import a8.me;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import o6.l;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // s9.d
    public final Object d1(me meVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(meVar.x(vb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) meVar.a(Context.class), (vb.a) arrayList.get(0));
            default:
                return new a((e) meVar.a(e.class), (sb.d) meVar.a(sb.d.class));
        }
    }
}

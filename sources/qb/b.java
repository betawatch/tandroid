package qb;

import android.content.Context;
import b8.ke;
import java.util.ArrayList;
import java.util.Collections;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements t9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i3) {
        this.a = i3;
    }

    @Override // t9.d
    public final Object q1(ke keVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(keVar.I(pb.a.class));
                m.i("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) keVar.a(Context.class), (pb.a) arrayList.get(0));
            default:
                return new a((e) keVar.a(e.class), (mb.d) keVar.a(mb.d.class));
        }
    }
}

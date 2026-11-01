package v7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class v8 implements w8 {
    public final ArrayList a;

    public v8(Context context, u8 u8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        u8Var.getClass();
        arrayList.add(new a9(context, u8Var));
    }

    @Override // v7.w8
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((w8) obj).a(aVar);
        }
    }
}

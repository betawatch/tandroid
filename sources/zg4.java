// default package

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zg4 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ hj3 a;

    public /* synthetic */ zg4(hj3 hj3Var) {
        this.a = hj3Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        fa4.g(exc, true);
        this.a.a(Collections.EMPTY_LIST);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (v9c v9cVar : (List) obj) {
            if (v9cVar.c == 1) {
                arrayList.add(v9cVar);
            }
        }
        this.a.a(arrayList);
    }
}

// default package

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xea extends ue3 {
    public final /* synthetic */ yea b5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xea(yea yeaVar, Context context) {
        super(context, true);
        this.b5 = yeaVar;
    }

    @Override // ue3
    public final boolean Z() {
        return false;
    }

    @Override // ue3
    public final boolean getIsPinned() {
        yea yeaVar = this.b5;
        ArrayList arrayList = yeaVar.f;
        sca scaVar = yeaVar.s;
        if (scaVar == null || scaVar.getAdapter() != yeaVar) {
            return false;
        }
        yeaVar.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((up9) arrayList.get(R)).b;
    }
}

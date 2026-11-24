// default package

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xga extends hg3 {
    public final /* synthetic */ yga b5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xga(yga ygaVar, Context context) {
        super(context, true);
        this.b5 = ygaVar;
    }

    @Override // hg3
    public final boolean X() {
        return false;
    }

    @Override // hg3
    public final boolean getIsPinned() {
        yga ygaVar = this.b5;
        ArrayList arrayList = ygaVar.f;
        sea seaVar = ygaVar.s;
        if (seaVar == null || seaVar.getAdapter() != ygaVar) {
            return false;
        }
        ygaVar.s.getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R >= arrayList.size()) {
            return false;
        }
        return ((vr9) arrayList.get(R)).b;
    }
}

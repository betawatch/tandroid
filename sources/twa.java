// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class twa extends o39 {
    public int f3;
    public final /* synthetic */ uxa g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twa(uxa uxaVar, Context context) {
        super(context, null);
        this.g3 = uxaVar;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        ywa ywaVar;
        super.onMeasure(i, i2);
        if (this.f3 != getMeasuredHeight() && (ywaVar = this.g3.X) != null) {
            ywaVar.f();
        }
        this.f3 = getMeasuredHeight();
    }
}

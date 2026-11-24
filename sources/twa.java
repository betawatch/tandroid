// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

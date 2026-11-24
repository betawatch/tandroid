// default package

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vo8 extends TextView implements tjb {
    public final /* synthetic */ ProfileActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.a = profileActivity;
        updateColors();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // tjb
    public final void updateColors() {
        setTextColor(bkb.v0(bkb.F6, this.a.A0));
    }
}

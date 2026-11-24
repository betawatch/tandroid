// default package

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wq8 extends TextView implements vlb {
    public final /* synthetic */ ProfileActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.a = profileActivity;
        updateColors();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // vlb
    public final void updateColors() {
        setTextColor(cmb.v0(cmb.F6, this.a.A0));
    }
}

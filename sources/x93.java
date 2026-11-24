// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x93 extends FrameLayout {
    public final lka a;
    public long b;

    public x93(Context context, ylb ylbVar) {
        super(context);
        lka lkaVar = new lka(context);
        lkaVar.setTextSize(16);
        anb.W(lkaVar, cmb.i5, ylbVar);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        addView(lkaVar);
        lka lkaVar2 = new lka(context);
        this.a = lkaVar2;
        lkaVar2.setTextSize(16);
        anb.W(lkaVar2, cmb.K6, ylbVar);
        lkaVar2.setGravity(jb6.a0 ? 3 : 5);
        addView(lkaVar2);
        lkaVar.l(jb6.a0("BoostingDateAndTime", null, 2131753504, new Object[0]), false);
        boolean z = jb6.a0;
        lkaVar.setLayoutParams(qoe.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 0.0f : 21.0f, 0.0f, z ? 21.0f : 0.0f, 0.0f));
        boolean z2 = jb6.a0;
        lkaVar2.setLayoutParams(qoe.d(-1, -2.0f, (z2 ? 3 : 5) | 16, z2 ? 21.0f : 0.0f, 0.0f, z2 ? 0.0f : 21.0f, 0.0f));
        anb.h(cmb.g5, ylbVar, this);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j) {
        this.b = j;
        Date date = new Date(j);
        this.a.l(jb6.a0("formatDateAtTime", null, 2131742446, jb6.D0().p0().format(date), jb6.D0().o0().format(date)), false);
    }
}

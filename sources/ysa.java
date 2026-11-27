// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ysa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ ysa(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.e2();
                break;
            case 1:
                wuaVar.onBackPressed();
                break;
            case 2:
                wuaVar.U1(false);
                break;
            case 3:
                wuaVar.g2();
                break;
            case 4:
                wuaVar.onBackPressed();
                break;
            default:
                wuaVar.Y1();
                break;
        }
    }
}

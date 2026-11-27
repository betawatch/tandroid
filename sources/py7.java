// default package

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class py7 extends d6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ e c;

    public /* synthetic */ py7(e eVar, Object obj, byte b) {
        this.a = b;
        this.c = eVar;
        this.b = obj;
    }

    @Override // d6
    public final void b(int i) {
        byte b = this.a;
        Object obj = this.b;
        int i2 = 0;
        e eVar = this.c;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) eVar;
                if (i != -1) {
                    if (i == 1) {
                        passcodeActivity.E = !passcodeActivity.E;
                        hl.d3(new pl7(this, (b8) obj, (byte) 16), 150L);
                        passcodeActivity.h.setText("");
                        ok2[] ok2VarArr = passcodeActivity.n.f;
                        int length = ok2VarArr.length;
                        while (i2 < length) {
                            ok2VarArr[i2].setText("");
                            i2++;
                        }
                        passcodeActivity.y0();
                        break;
                    }
                } else {
                    passcodeActivity.finishFragment();
                    break;
                }
                break;
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) eVar;
                ArrayList arrayList = proxyListActivity.F;
                if (i == -1) {
                    if (!arrayList.isEmpty()) {
                        proxyListActivity.a.F();
                        break;
                    } else {
                        proxyListActivity.finishFragment();
                        break;
                    }
                } else if (i == 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    String M0 = ob6.M0(arrayList.size() > 1 ? 2131751475 : 2131751476, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.U = M0;
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    idVar.S = ob6.M0(2131751474, null);
                    alertDialog$Builder.j(ob6.M0(2131751563, null), new jz7(this, (byte) 22));
                    proxyListActivity.showDialog(idVar);
                    TextView textView = (TextView) idVar.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, null);
                        break;
                    }
                } else if (i == 1) {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        wea weaVar = (wea) obj2;
                        if (sb.length() > 0) {
                            sb.append("\n\n");
                        }
                        sb.append(weaVar.a.e());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                    Intent createChooser = Intent.createChooser(intent, ob6.M0(arrayList.size() > 1 ? 2131745185 : 2131745186, null));
                    createChooser.setFlags(TLObject.FLAG_28);
                    ((Context) obj).startActivity(createChooser);
                    t20 t20Var = proxyListActivity.a;
                    if (t20Var != null) {
                        t20Var.F();
                        break;
                    }
                }
                break;
        }
    }
}

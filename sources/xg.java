// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xg implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ he[] c;
    public final /* synthetic */ View d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xg(EditTextBoldCursor editTextBoldCursor, int i, Object obj, he[] heVarArr, View view, byte b) {
        this.a = b;
        this.e = editTextBoldCursor;
        this.b = i;
        this.f = obj;
        this.c = heVarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        View view = this.d;
        he[] heVarArr = this.c;
        Object obj = this.f;
        int i2 = this.b;
        EditTextBoldCursor editTextBoldCursor = this.e;
        switch (b) {
            case 0:
                hk hkVar = (hk) editTextBoldCursor;
                af7 af7Var = (af7) obj;
                if (i == 6) {
                    String obj2 = hkVar.getText().toString();
                    if (obj2.length() > i2) {
                        gm.z3(hkVar);
                    } else {
                        af7Var.a(obj2);
                        he heVar = heVarArr[0];
                        if (heVar != null) {
                            heVar.dismiss();
                        }
                        if (view != null) {
                            view.requestFocus();
                        }
                    }
                    break;
                }
                break;
            default:
                j51 j51Var = (j51) editTextBoldCursor;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                if (i == 6) {
                    String obj3 = j51Var.getText().toString();
                    if (obj3.length() > 32) {
                        gm.z3(j51Var);
                    } else {
                        q51 d = q51.d(i2);
                        TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                        if (c != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = c.message;
                            tL_inputBusinessChatLink.entities = c.entities;
                            tL_inputBusinessChatLink.title = obj3;
                            d.b(c, tL_inputBusinessChatLink, null);
                        }
                        he heVar2 = heVarArr[0];
                        if (heVar2 != null) {
                            heVar2.dismiss();
                        }
                        if (heVarArr[0] == m51.e) {
                            m51.e = null;
                        }
                        if (view != null) {
                            view.requestFocus();
                        }
                    }
                    break;
                }
                break;
        }
        return false;
    }
}

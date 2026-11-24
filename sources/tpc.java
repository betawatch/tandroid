// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tpc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ypc b;

    public /* synthetic */ tpc(ypc ypcVar, byte b) {
        this.a = b;
        this.b = ypcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ypc ypcVar = this.b;
        switch (b) {
            case 0:
                if (ypcVar.y != null) {
                    gl.t1(ypcVar.O);
                    ypcVar.l0(ypcVar.y, null);
                    break;
                }
                break;
            case 1:
                if (ypcVar.y != null) {
                    gl.t1(ypcVar.O);
                    ypcVar.l0(ypcVar.y, null);
                    break;
                }
                break;
            case 2:
                ClipboardManager clipboardManager = (ClipboardManager) ypcVar.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(ypcVar.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            ypcVar.O.setText(coerceToText.toString().trim());
                            l7 l7Var = ypcVar.O;
                            l7Var.setSelection(l7Var.length());
                            break;
                        } else {
                            ypcVar.T = false;
                            ypcVar.o0(true);
                            break;
                        }
                    } else {
                        ypcVar.T = false;
                        ypcVar.o0(true);
                        break;
                    }
                } else {
                    ypcVar.T = false;
                    ypcVar.o0(true);
                    break;
                }
                break;
            default:
                ypcVar.h0();
                break;
        }
    }
}

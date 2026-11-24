// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class urc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ asc b;

    public /* synthetic */ urc(asc ascVar, byte b) {
        this.a = b;
        this.b = ascVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        asc ascVar = this.b;
        switch (b) {
            case 0:
                if (ascVar.y != null) {
                    gm.t1(ascVar.O);
                    ascVar.m0(ascVar.y, null);
                    break;
                }
                break;
            case 1:
                if (ascVar.y != null) {
                    gm.t1(ascVar.O);
                    ascVar.m0(ascVar.y, null);
                    break;
                }
                break;
            case 2:
                ClipboardManager clipboardManager = (ClipboardManager) ascVar.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(ascVar.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            ascVar.O.setText(coerceToText.toString().trim());
                            l7 l7Var = ascVar.O;
                            l7Var.setSelection(l7Var.length());
                            break;
                        } else {
                            ascVar.T = false;
                            ascVar.p0(true);
                            break;
                        }
                    } else {
                        ascVar.T = false;
                        ascVar.p0(true);
                        break;
                    }
                } else {
                    ascVar.T = false;
                    ascVar.p0(true);
                    break;
                }
                break;
            default:
                ascVar.i0();
                break;
        }
    }
}

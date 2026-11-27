// default package

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xq9 extends d6 {
    public final /* synthetic */ er9 a;

    public xq9(er9 er9Var) {
        this.a = er9Var;
    }

    @Override // d6
    public final void b(int i) {
        final er9 er9Var = this.a;
        vc2 vc2Var = er9Var.c;
        er9Var.j();
        if (i == -1) {
            er9Var.onBackPressed();
            return;
        }
        final byte b = 1;
        if (i == 1) {
            ir9.e(er9Var.a);
            return;
        }
        if (i == 9) {
            er9Var.f();
            return;
        }
        final byte b2 = 0;
        if (i == 10) {
            AlertDialog$Builder c = er9Var.c();
            id idVar = c.a;
            idVar.S = ob6.M0(xc2.W(er9Var.d) ? 2131743105 : 2131742972, null);
            TLRPC.Chat chat = er9Var.d;
            final EditTextBoldCursor d = er9Var.d(c, chat != null ? chat.title : "");
            d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
            if (!TextUtils.isEmpty(vc2Var.b.title)) {
                d.setText(vc2Var.b.title);
                d.setSelection(d.length());
            }
            c.j(ob6.M0(2131745674, null), new fd() { // from class: qq9
                @Override // fd
                public final void w(id idVar2, int i2) {
                    byte b3 = b;
                    EditTextBoldCursor editTextBoldCursor = d;
                    er9 er9Var2 = er9Var;
                    switch (b3) {
                        case 0:
                            hl.t1(editTextBoldCursor);
                            er9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            er9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                break;
                            }
                            break;
                        default:
                            hl.t1(editTextBoldCursor);
                            er9Var2.c.z(editTextBoldCursor.getText().toString());
                            break;
                    }
                }
            });
            c.g(ob6.M0(2131752570, null), new bu3(d, (byte) 5));
            idVar.setOnShowListener(new ee4(d, (byte) 2));
            d.setOnEditorActionListener(new sq9(idVar, b2));
            er9.o(idVar);
            return;
        }
        if (i != 11) {
            if (i == 12) {
                AlertDialog$Builder c2 = er9Var.c();
                id idVar2 = c2.a;
                boolean W = xc2.W(er9Var.d);
                idVar2.S = ob6.M0(W ? 2131743134 : 2131743033, null);
                idVar2.U = ob6.M0(W ? 2131743135 : 2131743034, null);
                c2.j(ob6.M0(2131743035, null), new rq9(er9Var));
                c2.g(ob6.M0(2131752570, null), null);
                er9.o(idVar2);
                View c3 = idVar2.c(-1);
                if (c3 instanceof TextView) {
                    ((TextView) c3).setTextColor(aob.w0(null, aob.mh, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder c4 = er9Var.c();
        id idVar3 = c4.a;
        if (vc2Var.w) {
            boolean z = vc2Var.b.record_video_active;
            idVar3.S = ob6.M0(2131742973, null);
            idVar3.U = ob6.M0(xc2.W(er9Var.d) ? 2131743106 : 2131742974, null);
            c4.j(ob6.M0(2131744498, null), new t41((byte) 13, er9Var, z));
            c4.g(ob6.M0(2131752570, null), null);
            er9.o(idVar3);
            return;
        }
        idVar3.S = ob6.M0(2131742978, null);
        idVar3.U = ob6.M0(2131742980, null);
        final EditTextBoldCursor d2 = er9Var.d(c4, ob6.M0(2131742995, null));
        c4.j(ob6.M0(2131744572, null), new fd() { // from class: qq9
            @Override // fd
            public final void w(id idVar22, int i2) {
                byte b3 = b2;
                EditTextBoldCursor editTextBoldCursor = d2;
                er9 er9Var2 = er9Var;
                switch (b3) {
                    case 0:
                        hl.t1(editTextBoldCursor);
                        er9Var2.c.C(2, editTextBoldCursor.getText().toString());
                        er9Var2.J.j(100, 0L, null);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().playStartRecordSound();
                            break;
                        }
                        break;
                    default:
                        hl.t1(editTextBoldCursor);
                        er9Var2.c.z(editTextBoldCursor.getText().toString());
                        break;
                }
            }
        });
        c4.g(ob6.M0(2131752570, null), new bu3(d2, (byte) 4));
        idVar3.setOnShowListener(new ee4(d2, (byte) 2));
        d2.setOnEditorActionListener(new sq9(idVar3, b2));
        er9.o(idVar3);
    }
}

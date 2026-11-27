// default package

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class x4b {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, e eVar, vnb vnbVar) {
        int i = yac.t0;
        Context context = eVar.getContext();
        zw3 zw3Var = new zw3(vnbVar, context, true, false);
        zw3Var.y1 = new bf(i, context, tL_messages_stickerSet);
        if (eVar.visibleDialog != null) {
            zw3Var.show();
        } else {
            eVar.showDialog(zw3Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, vnb vnbVar, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            String M0 = ob6.M0(2131744516, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131744517, null);
            alertDialog$Builder.j(ob6.M0(2131751563, null), new yw9(runnable, stickerSet, (byte) 6));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.show();
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, vnbVar);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, vnb vnbVar, Context context, icc iccVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        boolean z = stickerSet != null;
        String M0 = ob6.M0(z ? 2131751187 : 2131748016, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131744521, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(hl.L(24.0f), 0, hl.L(20.0f), 0);
        v4b v4bVar = new v4b(context);
        int i = aob.j5;
        yob.X(v4bVar, i, vnbVar);
        v4bVar.setInputType(16385);
        v4bVar.setTextSize(1, 16.0f);
        yob.X(v4bVar, i, vnbVar);
        yob.l(v4bVar, 36, aob.mg, vnbVar);
        yob.l(v4bVar, 35, aob.L6, vnbVar);
        v4bVar.setSingleLine(true);
        v4bVar.setFocusable(true);
        v4bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new x32(v4bVar, (byte) 2)});
        yob.F(v4bVar, aob.k6, aob.l6, aob.p7, vnbVar);
        v4bVar.setImeOptions(6);
        v4bVar.setBackground(null);
        v4bVar.requestFocus();
        v4bVar.setPadding(hl.L(ob6.a0 ? 28.0f : 0.0f), 0, hl.L(ob6.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(v4bVar);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(aob.w0(null, aob.B6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, tre.d(26, 20.0f, (ob6.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        v4bVar.addTextChangedListener(new w4b(numberTextView, v4bVar));
        if (z) {
            v4bVar.setText(stickerSet.title);
            v4bVar.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        idVar.H = (byte) 4;
        alertDialog$Builder.j(ob6.M0(z ? 2131751319 : 2131751718, null), new ag(v4bVar, iccVar, context, z));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new hja(v4bVar, (byte) 16));
        id o = alertDialog$Builder.o();
        o.k0 = false;
        v4bVar.setOnEditorActionListener(new sq9(o, (byte) 1));
    }
}

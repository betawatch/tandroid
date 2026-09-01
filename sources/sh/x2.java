package sh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q70;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class x2 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh.y b;
    public final /* synthetic */ d3 c;

    public x2(d3 d3Var, int i10, mh.y yVar) {
        this.c = d3Var;
        this.a = i10;
        this.b = yVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        q70 H = q70.H(this.c, view);
        int i10 = this.a;
        boolean z4 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final mh.y yVar = this.b;
        H.i(new Runnable() { // from class: sh.w2
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        mh.y yVar2 = yVar;
                        if (yVar2.g != 3) {
                            yVar2.g = 3;
                            yVar2.c = 0;
                            yVar2.d = false;
                            yVar2.i = false;
                            yVar2.f = 0L;
                            yVar2.j = null;
                            yVar2.h = false;
                            yVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        mh.y yVar3 = yVar;
                        if (yVar3.g != 2) {
                            yVar3.g = 2;
                            yVar3.c = 0;
                            yVar3.d = false;
                            yVar3.i = false;
                            yVar3.f = 0L;
                            yVar3.j = null;
                            yVar3.h = false;
                            yVar3.a();
                            break;
                        }
                        break;
                    default:
                        mh.y yVar4 = yVar;
                        if (yVar4.g != 1) {
                            yVar4.g = 1;
                            yVar4.c = 0;
                            yVar4.d = false;
                            yVar4.i = false;
                            yVar4.f = 0L;
                            yVar4.j = null;
                            yVar4.h = false;
                            yVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, string, z4);
        final int i12 = 1;
        H.i(new Runnable() { // from class: sh.w2
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        mh.y yVar2 = yVar;
                        if (yVar2.g != 3) {
                            yVar2.g = 3;
                            yVar2.c = 0;
                            yVar2.d = false;
                            yVar2.i = false;
                            yVar2.f = 0L;
                            yVar2.j = null;
                            yVar2.h = false;
                            yVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        mh.y yVar3 = yVar;
                        if (yVar3.g != 2) {
                            yVar3.g = 2;
                            yVar3.c = 0;
                            yVar3.d = false;
                            yVar3.i = false;
                            yVar3.f = 0L;
                            yVar3.j = null;
                            yVar3.h = false;
                            yVar3.a();
                            break;
                        }
                        break;
                    default:
                        mh.y yVar4 = yVar;
                        if (yVar4.g != 1) {
                            yVar4.g = 1;
                            yVar4.c = 0;
                            yVar4.d = false;
                            yVar4.i = false;
                            yVar4.f = 0L;
                            yVar4.j = null;
                            yVar4.h = false;
                            yVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i10 == 2);
        final int i13 = 2;
        H.i(new Runnable() { // from class: sh.w2
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        mh.y yVar2 = yVar;
                        if (yVar2.g != 3) {
                            yVar2.g = 3;
                            yVar2.c = 0;
                            yVar2.d = false;
                            yVar2.i = false;
                            yVar2.f = 0L;
                            yVar2.j = null;
                            yVar2.h = false;
                            yVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        mh.y yVar3 = yVar;
                        if (yVar3.g != 2) {
                            yVar3.g = 2;
                            yVar3.c = 0;
                            yVar3.d = false;
                            yVar3.i = false;
                            yVar3.f = 0L;
                            yVar3.j = null;
                            yVar3.h = false;
                            yVar3.a();
                            break;
                        }
                        break;
                    default:
                        mh.y yVar4 = yVar;
                        if (yVar4.g != 1) {
                            yVar4.g = 1;
                            yVar4.c = 0;
                            yVar4.d = false;
                            yVar4.i = false;
                            yVar4.f = 0L;
                            yVar4.j = null;
                            yVar4.h = false;
                            yVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), i10 == 1);
        H.V(5);
        H.t = false;
        H.s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}

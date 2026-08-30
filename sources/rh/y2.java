package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.o70;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class y2 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh.z b;
    public final /* synthetic */ e3 c;

    public y2(e3 e3Var, int i10, lh.z zVar) {
        this.c = e3Var;
        this.a = i10;
        this.b = zVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o70 H = o70.H(this.c, view);
        int i10 = this.a;
        boolean z4 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final lh.z zVar = this.b;
        H.i(new Runnable() { // from class: rh.x2
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        lh.z zVar2 = zVar;
                        if (zVar2.g != 3) {
                            zVar2.g = 3;
                            zVar2.c = 0;
                            zVar2.d = false;
                            zVar2.i = false;
                            zVar2.f = 0L;
                            zVar2.j = null;
                            zVar2.h = false;
                            zVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.g != 2) {
                            zVar3.g = 2;
                            zVar3.c = 0;
                            zVar3.d = false;
                            zVar3.i = false;
                            zVar3.f = 0L;
                            zVar3.j = null;
                            zVar3.h = false;
                            zVar3.a();
                            break;
                        }
                        break;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.g != 1) {
                            zVar4.g = 1;
                            zVar4.c = 0;
                            zVar4.d = false;
                            zVar4.i = false;
                            zVar4.f = 0L;
                            zVar4.j = null;
                            zVar4.h = false;
                            zVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, string, z4);
        final int i12 = 1;
        H.i(new Runnable() { // from class: rh.x2
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        lh.z zVar2 = zVar;
                        if (zVar2.g != 3) {
                            zVar2.g = 3;
                            zVar2.c = 0;
                            zVar2.d = false;
                            zVar2.i = false;
                            zVar2.f = 0L;
                            zVar2.j = null;
                            zVar2.h = false;
                            zVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.g != 2) {
                            zVar3.g = 2;
                            zVar3.c = 0;
                            zVar3.d = false;
                            zVar3.i = false;
                            zVar3.f = 0L;
                            zVar3.j = null;
                            zVar3.h = false;
                            zVar3.a();
                            break;
                        }
                        break;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.g != 1) {
                            zVar4.g = 1;
                            zVar4.c = 0;
                            zVar4.d = false;
                            zVar4.i = false;
                            zVar4.f = 0L;
                            zVar4.j = null;
                            zVar4.h = false;
                            zVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i10 == 2);
        final int i13 = 2;
        H.i(new Runnable() { // from class: rh.x2
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        lh.z zVar2 = zVar;
                        if (zVar2.g != 3) {
                            zVar2.g = 3;
                            zVar2.c = 0;
                            zVar2.d = false;
                            zVar2.i = false;
                            zVar2.f = 0L;
                            zVar2.j = null;
                            zVar2.h = false;
                            zVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.g != 2) {
                            zVar3.g = 2;
                            zVar3.c = 0;
                            zVar3.d = false;
                            zVar3.i = false;
                            zVar3.f = 0L;
                            zVar3.j = null;
                            zVar3.h = false;
                            zVar3.a();
                            break;
                        }
                        break;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.g != 1) {
                            zVar4.g = 1;
                            zVar4.c = 0;
                            zVar4.d = false;
                            zVar4.i = false;
                            zVar4.f = 0L;
                            zVar4.j = null;
                            zVar4.h = false;
                            zVar4.a();
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

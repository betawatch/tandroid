package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class wo extends ClickableSpan {
    public final /* synthetic */ int a;

    public /* synthetic */ wo(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                of.f.s(view.getContext(), "https://t.me/BotFather");
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                break;
        }
    }

    private final void a(View view) {
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rl0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public float c;
    public final /* synthetic */ KeyEvent.Callback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl0(Context context, EditTextBoldCursor editTextBoldCursor, int i9) {
        super(context);
        this.a = i9;
        this.d = editTextBoldCursor;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout = ((EditTextBoldCursor) this.d).getErrorLayout(size);
                this.b = errorLayout;
                if (errorLayout != null) {
                    int lineCount = errorLayout.getLineCount();
                    int i11 = 0;
                    if (lineCount > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount - 1) - ((StaticLayout) this.b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), TLObject.FLAG_30);
                    }
                    if (LocaleController.isRTL) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i11 < lineCount) {
                                if (((StaticLayout) this.b).getLineLeft(i11) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.b).getLineWidth(i11));
                                    if (i11 == lineCount - 1) {
                                        this.c = size - f10;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i9, i10);
                break;
            case 1:
                int size2 = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout2 = ((EditTextBoldCursor) this.d).getErrorLayout(size2);
                this.b = errorLayout2;
                if (errorLayout2 != null) {
                    int lineCount2 = errorLayout2.getLineCount();
                    int i12 = 0;
                    if (lineCount2 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), TLObject.FLAG_30);
                    }
                    if (LocaleController.isRTL) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i12 < lineCount2) {
                                if (((StaticLayout) this.b).getLineLeft(i12) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.b).getLineWidth(i12));
                                    if (i12 == lineCount2 - 1) {
                                        this.c = size2 - f11;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i9, i10);
                break;
            case 2:
                int size3 = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout3 = ((EditTextBoldCursor) this.d).getErrorLayout(size3);
                this.b = errorLayout3;
                if (errorLayout3 != null) {
                    int lineCount3 = errorLayout3.getLineCount();
                    int i13 = 0;
                    if (lineCount3 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), TLObject.FLAG_30);
                    }
                    if (LocaleController.isRTL) {
                        float f12 = 0.0f;
                        while (true) {
                            if (i13 < lineCount3) {
                                if (((StaticLayout) this.b).getLineLeft(i13) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f12 = Math.max(f12, ((StaticLayout) this.b).getLineWidth(i13));
                                    if (i13 == lineCount3 - 1) {
                                        this.c = size3 - f12;
                                    }
                                    i13++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i9, i10);
                break;
            default:
                super.onMeasure(i9, i10);
                org.telegram.ui.Components.pi0 pi0Var = ((org.telegram.ui.Components.wh0) this.d).h;
                float measuredHeight = (r0.f / 768.0f) * ((org.telegram.ui.Components.ge) this.b).getMeasuredHeight();
                if (this.c != measuredHeight) {
                    this.c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = pi0Var.getLayoutParams();
                    int i14 = (int) measuredHeight;
                    pi0Var.getLayoutParams().width = i14;
                    layoutParams.height = i14;
                    super.onMeasure(i9, i10);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(org.telegram.ui.Components.wh0 wh0Var, Context context, org.telegram.ui.Components.ge geVar) {
        super(context);
        this.a = 3;
        this.d = wh0Var;
        this.b = geVar;
    }
}

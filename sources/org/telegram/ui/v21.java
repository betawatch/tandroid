package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t21 t21Var = (t21) ((ag.w) this.b).e;
                if (t21Var != null) {
                    t21Var.run();
                    break;
                }
                break;
            case 1:
                ((c31) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((m31) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.d0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        lh.w3 w3Var = secretMediaViewer.r;
                        if (w3Var.R) {
                            w3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 5:
                k61 k61Var = (k61) this.b;
                if (k61Var.W instanceof TLRPC.User) {
                    lh.d dVar = k61Var.d0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        k61Var.T((TLRPC.User) k61Var.W, null, null);
                        break;
                    }
                }
                break;
            case 6:
                k71.a((k71) this.b);
                break;
            case 7:
                ((dd1) this.b).c(true);
                break;
            case 8:
                ((dd1) ((cg.u) this.b).c).c(true);
                break;
            case 9:
                ld1 ld1Var = (ld1) this.b;
                ArrayList arrayList = ld1Var.f;
                HashSet hashSet = ld1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ld1Var.getMessagesController().getUser(Long.valueOf(ld1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ld1Var.getMessagesController().putChat(chat, false);
                        ld1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    ld1Var.finishFragment();
                    break;
                }
                break;
            default:
                ei1 ei1Var = (ei1) this.b;
                ei1Var.a.c(!r0.b(), true);
                ei1Var.c.setEnabled(ei1Var.a.b());
                ei1Var.c.animate().alpha(ei1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}

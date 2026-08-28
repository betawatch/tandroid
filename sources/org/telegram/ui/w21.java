package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w21(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u21 u21Var = (u21) ((bh.g) this.b).e;
                if (u21Var != null) {
                    u21Var.run();
                    break;
                }
                break;
            case 1:
                ((d31) this.b).dismiss();
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
                ((n31) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.d0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        kh.x3 x3Var = secretMediaViewer.r;
                        if (x3Var.R) {
                            x3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 5:
                l61 l61Var = (l61) this.b;
                if (l61Var.W instanceof TLRPC.User) {
                    kh.d dVar = l61Var.d0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        l61Var.S((TLRPC.User) l61Var.W, null, null);
                        break;
                    }
                }
                break;
            case 6:
                l71.a((l71) this.b);
                break;
            case 7:
                ((dd1) this.b).c(true);
                break;
            case 8:
                ((dd1) ((bg.x) this.b).c).c(true);
                break;
            case 9:
                kd1 kd1Var = (kd1) this.b;
                ArrayList arrayList = kd1Var.f;
                HashSet hashSet = kd1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = kd1Var.getMessagesController().getUser(Long.valueOf(kd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i9)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i9));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        kd1Var.getMessagesController().putChat(chat, false);
                        kd1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    kd1Var.finishFragment();
                    break;
                }
                break;
            default:
                fi1 fi1Var = (fi1) this.b;
                fi1Var.a.c(!r0.b(), true);
                fi1Var.c.setEnabled(fi1Var.a.b());
                fi1Var.c.animate().alpha(fi1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
